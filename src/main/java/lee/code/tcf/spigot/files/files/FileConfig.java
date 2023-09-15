package lee.code.tcf.spigot.files.files;

import lee.code.tcf.spigot.TabCompleteFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FileConfig {
    OP_BYPASS("op-player-filter-bypass", "false"),
    ;
    @Getter private final String path;
    @Getter private final String string;

    public boolean getBoolean() {
        return TabCompleteFilter.getInstance().getFileManager().getBooleanFromFile(File.ARGS.name().toLowerCase(), path);
    }
}
