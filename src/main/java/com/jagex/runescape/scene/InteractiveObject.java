package com.jagex.runescape.scene;

import com.jagex.runescape.Class27;
import com.jagex.runescape.ProducingGraphicsBuffer;
import com.jagex.runescape.RSString;
import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.language.English;
import com.jagex.runescape.media.renderable.Renderable;

public class InteractiveObject {
    public static Cache aClass9_470 = new Cache(10);
    public static int menuOffsetX;
    public static ProducingGraphicsBuffer tabTop;
    public static int[] firstMenuOperand = new int[500];
    public static Class27 aClass27_485 = new Class27();
    public static int anInt487 = 0;
    public static CacheIndex aCacheIndex_488;
    public static byte[][][] aByteArrayArrayArray492;
    public static int playerRights = 0;
    public static boolean showFps = false;

    public int z;
    public int hash;
    public int config = 0;
    public int worldY;
    public int tileLeft;
    public Renderable renderable;
    public int worldX;
    public int tileBottom;
    public int worldZ;
    public int rotation;
    public int tileTop;
    public int tileRight;
    public int cycle;
    public int anInt491;

    public InteractiveObject() {
        hash = 0;
    }

    public static RSString method279(byte[] arg0, boolean arg1, int arg2, int arg3) {
        RSString class1 = new RSString();
        class1.length = 0;
        class1.chars = new byte[arg3];
        if(!arg1)
            English.publicChat = null;
        for(int i = arg2; arg3 + arg2 > i; i++) {
            if(arg0[i] != 0)
                class1.chars[class1.length++] = arg0[i];
        }
        return class1;
    }


}
