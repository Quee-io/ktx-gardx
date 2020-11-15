package io.quee.ktx.gardx.domain.credential

import io.quee.ktx.gardx.domain.credential.base.UserCredentialDomain

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 06, **Fri Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface EmailPasswordUserCredentialDomain : UserCredentialDomain {
    val email: String
    val password: ByteArray
}