package io.quee.ktx.gardx.domain.user

import io.quee.ktx.gardx.domain.role.RoleDomain
import io.quee.ktx.radix.develop.identity.Identity
import java.time.LocalDate

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 01, **Sun Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface UserDomain : Identity<String> {
    override val uuid: String
    val role: RoleDomain
    val fullName: String
    val birthdate: LocalDate?
    val avatar: String?
    val accessEndDate: LocalDate?
}