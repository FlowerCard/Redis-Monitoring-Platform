import React, {useEffect, useState} from "react";
import api from "../../services/api";

interface OverviewDTO {
    name: string;
    usedMemory: number;
    totalKeys: number;
    connectedClients: number;
    hitRate: number;
}

export default function OverviewPage() {
    const [instances, setInstances] = useState<OverviewDTO[]>([]);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        api.get("/api/overview")
            .then((res) => {
                setInstances(res.data.data);
                setError(null);
            })
            .catch((err) => {
                console.error("获取数据失败:", err);
                setError("获取数据失败，请检查后端服务是否正常运行");
            });
    }, []);

    if (error) {
        return <div style={{color: 'red', padding: '20px'}}>{error}</div>;
    }

    return (
        <div style={{padding: '20px'}}>
            <h2>Redis 系统概览</h2>
            {instances.length === 0 ? (
                <div>加载中...</div>
            ) : (
                <table style={{width: '100%', borderCollapse: 'collapse'}}>
                    <thead>
                    <tr>
                        <th style={{padding: '10px', border: '1px solid #ddd'}}>名称</th>
                        <th style={{padding: '10px', border: '1px solid #ddd'}}>内存使用</th>
                        <th style={{padding: '10px', border: '1px solid #ddd'}}>总Key数</th>
                        <th style={{padding: '10px', border: '1px solid #ddd'}}>连接数</th>
                        <th style={{padding: '10px', border: '1px solid #ddd'}}>命中率</th>
                    </tr>
                    </thead>
                    <tbody>
                    {instances.map((i, idx) => (
                        <tr key={idx}>
                            <td style={{padding: '10px', border: '1px solid #ddd'}}>{i.name}</td>
                            <td style={{padding: '10px', border: '1px solid #ddd'}}>{i.usedMemory} MB</td>
                            <td style={{padding: '10px', border: '1px solid #ddd'}}>{i.totalKeys}</td>
                            <td style={{padding: '10px', border: '1px solid #ddd'}}>{i.connectedClients}</td>
                            <td style={{padding: '10px', border: '1px solid #ddd'}}>{i.hitRate} %</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            )}
        </div>
    );
}

