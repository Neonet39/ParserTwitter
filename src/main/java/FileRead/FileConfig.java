package FileRead;

public class FileConfig {
    private static String key_patch;
    private static String link_panch;

    public static String getKey_patch()
    {
        return key_patch;
    }

    public static void setKey_patch(String key_patchInp) {
        key_patch = key_patchInp;
    }

    public static String getLink_panch(){
        return link_panch;
    }

    public static void setLink_panch(String link_panchInp) {
        link_panch = link_panchInp;
    }
}
