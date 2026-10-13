package hoodles.morphe.patches.floathub.premium

import app.morphe.patcher.patch.bytecodePatch
import hoodles.morphe.compatibility.Compat
import hoodles.morphe.patches.bend.shared.stripPairipPatch
import hoodles.morphe.patches.shared.revenuecat.getAddEntitlementPatch
import hoodles.morphe.util.requireArm64


val unlockPatch = bytecodePatch(
    name = "Unlock Premium",
    description = "Unlock app features. Requirements: arm64-v8a, strict apk version"
) {
    compatibleWith(Compat.FLOAT_HUB)

    availability(requireArm64())

    dependsOn(getAddEntitlementPatch("default"))
}
