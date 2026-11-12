package com.xiaoyv.bangumi.shared.core.types.settings

import androidx.annotation.IntDef
import com.xiaoyv.bangumi.core_resource.resources.Res
import com.xiaoyv.bangumi.core_resource.resources.settings_bar_liquid_glass_style_ios
import com.xiaoyv.bangumi.core_resource.resources.settings_bar_liquid_glass_style_os4

/**
 * 液态玻璃底栏样式：iOS 风格悬浮底栏，或 HyperOS 4（Miuix）玻璃胶囊底栏。
 */
@IntDef(
    SettingLiquidGlassStyle.IOS,
    SettingLiquidGlassStyle.OS4,
)
@Retention(AnnotationRetention.SOURCE)
annotation class SettingLiquidGlassStyle {
    companion object {
        const val IOS = 0
        const val OS4 = 1

        fun string(@SettingLiquidGlassStyle value: Int) = when (value) {
            OS4 -> Res.string.settings_bar_liquid_glass_style_os4
            else -> Res.string.settings_bar_liquid_glass_style_ios
        }
    }
}
