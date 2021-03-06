package us.myles.ViaVersion.dump;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class VersionInfo {
    private String javaVersion;
    private String operatingSystem;
    private int serverProtocol;
    private Set<Integer> enabledProtocols;
    private String platformName;
    private String platformVersion;
    private String pluginVersion;
}

