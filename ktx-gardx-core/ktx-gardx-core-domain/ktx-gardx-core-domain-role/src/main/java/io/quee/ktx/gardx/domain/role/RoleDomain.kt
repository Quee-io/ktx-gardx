package io.quee.ktx.gardx.domain.role

import io.quee.ktx.radix.develop.identity.Identity

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 07, **Sat Nov, 2020**
 * Project **ktx-gardx** [Quee.IO](https://quee.io)
 */
interface RoleDomain : Identity<String> {
    override val uuid: String
    val roleName: String
}