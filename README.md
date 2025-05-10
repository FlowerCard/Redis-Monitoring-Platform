# 📊 Redis监控平台 · Redis Monitoring Platform (RMP)

> 一站式 Redis 性能监控、Key可视化分析与告警系统。专为私有化部署、企业级使用场景打造。

![GitHub stars](https://img.shields.io/github/stars/FlowerCard/Redis-Monitoring-Platform?style=social)
![GitHub License](https://img.shields.io/github/license/FlowerCard/Redis-Monitoring-Platform)
![Java](https://img.shields.io/badge/backend-Java17-blue) ![React](https://img.shields.io/badge/frontend-React-green) ![Docker](https://img.shields.io/badge/deploy-Docker-orange)

---

## 🚀 为什么做这个项目？

在企业实践中，我们发现传统的 Redis 监控方式存在以下明显短板：

- Redis 自带的 `INFO` 命令虽数据丰富，但难以可视化对比；
- 多节点/多环境的管理混乱、指标分散；
- 业务关键 Key 无法追踪；
- 没有统一告警、无历史数据可查；
- 不支持跨内网/复杂网络结构的 Redis 接入。

`Redis Monitoring Platform (RMP)` 的使命，就是将 Redis 的黑盒运行，变成一张「动态仪表盘」：实时、直观、透明、可回溯。

---

## 🧩 项目特点

| 特性            | 描述                       |
|---------------|--------------------------|
| 🌐 全局集群可视化    | 集群拓扑结构+主从状态一图掌握          |
| 🔍 Key级别监控    | Pattern追踪+高频Key排行        |
| 📊 高度可定制仪表盘   | 支持图表组件自由拖拽               |
| 🔔 多维度告警配置    | 邮件、Webhook、企业微信支持        |
| 🧰 便捷部署       | 支持 Docker 一键部署 / Jar 包直跑 |
| 🌍 企业级私有部署友好  | 支持 Agent 跨网段拉通           |
| 🧱 插件化设计（开发中） | 可扩展新模块：Stream、Geo、命令黑名单等 |

---

## 📐 系统架构

```text
┌────────────┐    HTTP+WebSocket     ┌────────────┐
│   Browser  │ ────────────────────▶ │   RMP UI   │
└────────────┘                       └────────────┘
│
▼
┌─────────────────────┐
│    RMP Backend API  │
└─────────────────────┘
│
┌─────────────┼─────────────┐
▼                           ▼
Redis Agent (可选)           Redis Server(s)
```

- **前端（Frontend）**：React + Ant Design + ECharts  
- **后端（Backend）**：Spring Boot + WebFlux（异步非阻塞）+ Lettuce  
- **数据存储**：默认内置SQLite，支持切换至MySQL/PostgreSql  
- **可选Agent架构**：适配企业级复杂网络结构，实现“外部监控内网Redis”

---

## 🔧 快速开始（Quick Start）

**环境要求：**

- Java 17+
- Node.js 18+（前端构建）
- Redis（建议多个实例便于演示）
- Docker（推荐）

**推荐部署方式：Docker 一键启动**

```bash
git clone https://github.com/FlowerCard/Redis-Monitoring-Platform.git
cd Redis-Monitoring-Platform
docker-compose up -d
```

打开浏览器访问：http://localhost:8080  
默认登录账号密码：`admin / admin123`

👉 更多详细部署方式请见：[部署文档](docs/setup.md)

---

## 🧠 功能模块一览

| 模块       | 简介               | 文档                                  |
|----------|------------------|-------------------------------------|
| 🔍 系统概览  | 实例/集群健康态总览，指标一览  | [查看文档](docs/modules/overview.md)    |
| 📈 仪表盘   | 拖拽式图表组件，自定义可视化   | [查看文档](docs/modules/dashboard.md)   |
| 🧭 集群管理  | 主从结构展示、节点命令操作    | [查看文档](docs/modules/cluster.md)     |
| 🔑 Key监控 | Pattern订阅、生命周期分析 | [查看文档](docs/modules/key_monitor.md) |
| ⚙ 性能分析   | 慢查询统计、热命令分析      | [查看文档](docs/modules/performance.md) |
| 🔔 告警通知  | 支持多种规则与通知方式      | [查看文档](docs/modules/alert.md)       |

---

## 🔒 企业私有部署建议

RMP 特别支持通过轻量级 Agent 模式，实现企业复杂网络结构中的 Redis 接入：

- 每台服务器部署 Java 编写的轻量 Agent；
- Agent 通过注册中心将数据上报至中心平台；
- 支持身份认证、防止越权访问；
- 极低性能开销，单线程异步设计；

👉 详细指南：[Agent部署文档](docs/agent-guide.md)

---

## 🧭 项目路线图（Roadmap）

- [x] 前后端架构搭建与初版仪表盘
- [x] Key监控与生命周期分析
- [x] Docker部署支持
- [ ] 插件机制（Stream/BloomFilter/命令白名单）
- [ ] Prometheus Exporter对接
- [ ] 多租户认证系统（SaaS方向）
- [ ] 智能告警推荐引擎（AI辅助）

---

## 💬 FAQ：常见问题

**Q1: 支持哪些 Redis 部署方式？**  
A: 支持 Standalone、Sentinel、Cluster 模式。

**Q2: 是否支持云 Redis？（如AWS Redis）**  
A: 只要可以访问Redis IP和端口，即可添加监控。

**Q3: 运行后是否对 Redis 产生压力？**  
A: 使用 Lettuce 异步连接，查询频率可控，资源占用非常低。

**Q4: 能不能扩展为商业产品？**  
A: 项目采用MIT协议，允许商用。如需授权支持请联系作者。

---

## 🤝 如何参与贡献

我们欢迎所有开发者一起构建更强大的 RMP：

- ⭐ 给项目点个 Star，支持我们持续开发
- 🐞 提 Issue，反馈Bug或建议
- 🧪 提交 PR，贡献代码或文档
- 📚 撰写教程与案例分享

👉 开发者文档入口：[开发指南](docs/developer-guide.md)

---

## 📄 License

本项目采用 MIT 开源协议。可自由使用、修改、二次分发。

---

## ❤️ 致谢

本项目灵感与部分组件参考自：

- [Redis](https://redis.io/)
- [Ant Design](https://ant.design/)
- [Lettuce](https://github.com/lettuce-io/lettuce-core)
- [Spring Boot](https://spring.io/projects/spring-boot)
- 感谢每一位热爱开源并愿意分享的人

---

## 📎 联系我们

📘 项目地址：[https://github.com/FlowerCard/Redis-Monitoring-Platform](https://github.com/FlowerCard/Redis-Monitoring-Platform)  
📫 联系作者：flowercard591@gmail.com

> Redis 应该不仅是一个数据库，更应该是一个可观测的运行系统。RMP 希望成为你的 Redis 眼睛与耳朵，帮你看见每一个关键时刻。