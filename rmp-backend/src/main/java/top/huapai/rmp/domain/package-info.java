/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 10:12
 * @Description 本包主要用于存放领域层：核心领域模型、聚合根、领域事件
 *
 *              <p>
 *              这里放置最纯净的业务模型与业务逻辑，不依赖 Spring 或任何框架，只是“Java Object + Interface”。 主要包含以下内容：
 *              <ul>
 *              <li>{@link top.huapai.rmp.domain.model} 聚合根（Aggregate Root）、实体（Entity）、值对象（Value Object）</li>
 *              <li>{@link top.huapai.rmp.domain.repository} 领域领域仓储接口（非实现）</li>
 *              <li>{@link top.huapai.rmp.domain.service} 领域服务（如果业务逻辑不属于某个实体）</li>
 *              </ul>
 *              </p>
 */
package top.huapai.rmp.domain;