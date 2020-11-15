package io.quee.ktx.gardx.domain.user.token

import io.quee.ktx.gardx.domain.user.secret.UserSecretDomain
import io.quee.ktx.radix.develop.identity.Identity

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 07, **Sat Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface UserTokenDomain : Identity<String> {
    val userSecret: UserSecretDomain
    val accessToken: String
}