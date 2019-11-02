/**
 * Copyright 2017-2019 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.zhudy.duic

import io.zhudy.kitty.core.biz.BizCode

/**
 * 错误码定义枚举。
 *
 * @author Kevin Zou (kevinz@weghst.com)
 */
enum class BizCodes(override val code: Int, override val message: String, override val status: Int = 400) : BizCode {

    // 应用错误码
    C1000(1000, "未找到应用"),
    C1001(1001, "未找到应用 profile"),
    C1002(1001, "未找到配置项"),
    C1003(1003, "修改 app content 失败"),
    C1004(1004, "修改 app content 失败, 数据版本不一致"),
    C1005(1005, "数据类型不一致无法合并"),
    C1006(1006, "app content 不是有效的 yaml 格式"),
    C1429(1429, "监控请求达到上限"),

    // 用户错误码
    C2000(2000, "用户不存在"),
    C2001(2001, "密码不匹配"),
    ;
}