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
package io.zhudy.duic.repository

import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.support.TransactionTemplate

/**
 * 事务数据操作基类。
 *
 * @author Kevin Zou (kevinz@weghst.com)
 */
abstract class AbstractTransactionRepository(
        private val transactionManager: PlatformTransactionManager
) {

    /**
     * 返回一个事务模板实例。
     */
    protected val transactionTemplate: TransactionTemplate
        get() = TransactionTemplate(transactionManager)

}