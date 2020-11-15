package io.quee.ktx.gardx.domain.access.log

import io.quee.ktx.radix.develop.identity.Identity

/**
 * Created By [**Ibrahim AlTamimi **](https://www.linkedin.com/in/iloom/)
 * Created At 01, **Sun Nov, 2020**
 * Project **ktx-gardx** [**Quee.IO**](https://quee.io)
 */
interface AccessLogDomain : Identity<String> {
    override val uuid: String
    val accessToken: String?
    val userId: String?
    val roleName: String?
    val mapping: String
    val granted: Boolean
}