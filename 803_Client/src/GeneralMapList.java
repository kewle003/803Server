/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GeneralMapList
{
    JS5 configClient;//aClass210_7957
    int anInt7958;
    GeneralMap[] aClass241_Sub39_Sub3Array7959;
    
    public GeneralMap method13431(int i) {
	if (i < 0)
	    return new GeneralMap();
	return aClass241_Sub39_Sub3Array7959[i];
    }
    
    public GeneralMap method13432(int i) {
	if (i < 0)
	    return new GeneralMap();
	return aClass241_Sub39_Sub3Array7959[i];
    }
    
    public GeneralMap method13433(int i) {
	if (i < 0)
	    return new GeneralMap();
	return aClass241_Sub39_Sub3Array7959[i];
    }
    
    public GeneralMap method13434(int i) {
	if (i < 0)
	    return new GeneralMap();
	return aClass241_Sub39_Sub3Array7959[i];
    }
    
    public GeneralMapList(GameDefinition game, Language locale, JS5 class210, boolean bool) {
		configClient = class210;
		int i = configClient.getFileCount((byte) -10) - 1;
		anInt7958 = ((i * Js5ConfigGroup.GENERAL_MAPS.getGroupSize(-1572627958)
			+ configClient.getContainerCount(i, (byte) -110)) * -458870391);
		if (bool) {
		    aClass241_Sub39_Sub3Array7959 = new GeneralMap[anInt7958 * 1667994809];
		    for (int i_0_ = 0; i_0_ < 1667994809 * anInt7958; i_0_++) {
				byte[] data;
				synchronized (configClient) {
					data = configClient.getfile(
				    		Js5ConfigGroup.GENERAL_MAPS.getClientGroupId(i_0_, (byte) -98),
				    		Js5ConfigGroup.GENERAL_MAPS.getClientFileId(i_0_, -1325326940),
				    		724980647);
				}
				GeneralMap map = new GeneralMap();
				if (null != data) {
					map.decode(new RSByteBuffer(data), (byte) 37);
				}
				aClass241_Sub39_Sub3Array7959[i_0_] = map;
		    }
		}
    }
    
    public GeneralMap method13435(int id, int i_1_) {
		if (id < 0) {
		    return new GeneralMap();
		}
		return aClass241_Sub39_Sub3Array7959[id];
    }
    
    public GeneralMap method13436(int i) {
		if (i < 0)
		    return new GeneralMap();
		return aClass241_Sub39_Sub3Array7959[i];
    }
    
    static final void method13437(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 4 == 115241065 * Class296.anInt4513 ? 1 : 0;
    }
    
    static void setInterfaceModel/*method13438*/(int compHash, int type, int index, int i_4_, int i_5_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(4, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * type;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951 = index * 1861259375;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935 = i_4_ * -1424982471;
    }
}
