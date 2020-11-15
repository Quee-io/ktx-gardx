package io.quee.ktx.gardx.domain.credential.base

import io.quee.ktx.gardx.domain.user.UserDomain
import io.quee.ktx.radix.develop.identity.Identity

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 06, **Fri Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface UserCredentialDomain : Identity<String> {
    val user: UserDomain
}