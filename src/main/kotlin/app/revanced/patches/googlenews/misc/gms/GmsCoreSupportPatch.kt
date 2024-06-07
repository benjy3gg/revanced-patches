package app.revanced.patches.googlenews.misc.gms

import app.revanced.patches.googlenews.misc.gms.Constants.MAGAZINES_PACKAGE_NAME
import app.revanced.patches.googlenews.misc.gms.Constants.REVANCED_MAGAZINES_PACKAGE_NAME
import app.revanced.patches.googlenews.misc.gms.GmsCoreSupportResourcePatch.gmsCoreVendorGroupIdOption
import app.revanced.patches.googlenews.misc.gms.fingerprints.MagazinesActivityOnCreateFingerprint
import app.revanced.patches.googlenews.misc.gms.fingerprints.ServiceCheckFingerprint
import app.revanced.patches.googlenews.misc.integrations.IntegrationsPatch
import app.revanced.patches.shared.misc.gms.BaseGmsCoreSupportPatch

@Suppress("unused")
object GmsCoreSupportPatch : BaseGmsCoreSupportPatch(
    fromPackageName = MAGAZINES_PACKAGE_NAME,
    toPackageName = REVANCED_MAGAZINES_PACKAGE_NAME,
    primeMethodFingerprint = null,
    earlyReturnFingerprints = setOf(ServiceCheckFingerprint),
    mainActivityOnCreateFingerprint = MagazinesActivityOnCreateFingerprint,
    integrationsPatchDependency = IntegrationsPatch::class,
    gmsCoreSupportResourcePatch = GmsCoreSupportResourcePatch,
    compatiblePackages = setOf(CompatiblePackage(MAGAZINES_PACKAGE_NAME)),
    fingerprints = setOf(ServiceCheckFingerprint),
) {
    override val gmsCoreVendorGroupId by gmsCoreVendorGroupIdOption
}
