package io.quee.ktx.gardx.domain.user.secret

import io.quee.ktx.gardx.domain.user.UserDomain
import io.quee.ktx.radix.develop.identity.Identity
import java.time.LocalDate

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 07, **Sun Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface UserSecretDomain : Identity<String> {
    override val uuid: String
    val user: UserDomain
    val secret: String
    val invalidateDate: LocalDate?
}