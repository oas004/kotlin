// !DIAGNOSTICS: -UNUSED_PARAMETER
// !EXPLICIT_FLEXIBLE_TYPES
// !CHECK_TYPE
package ppp

import checkType
import _

fun foo(f: ft<Int, Int?>) {
    f.checkType { _<Int>() }
    f.checkType { _<Int?>() }
}
