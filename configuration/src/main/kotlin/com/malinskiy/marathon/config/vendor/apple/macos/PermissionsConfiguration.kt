package com.malinskiy.marathon.config.vendor.apple.macos

import com.fasterxml.jackson.annotation.JsonProperty

data class PermissionsConfiguration(
    @JsonProperty("grant") val grant: Map<String, Set<Permission>> = emptyMap(),
)


/**
 * @property All Apply the action to all services
 */
enum class Permission(val value: String) {
    @JsonProperty("accessibility") Accessibility("kTCCServiceAccessibility"),
    @JsonProperty("developer-tool") DeveloperTool("kTCCServiceDeveloperTool"),
}
