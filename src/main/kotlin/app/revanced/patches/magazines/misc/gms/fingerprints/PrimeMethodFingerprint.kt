package app.revanced.patches.magazines.misc.gms.fingerprints


import app.revanced.patcher.fingerprint.MethodFingerprint

internal object PrimeMethodFingerprint : MethodFingerprint(
    strings = listOf("com.google.android.GoogleCamera", "com.android.vending")
)
