/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class ClientMessage
{
    static ClientMessage FRIENDS_CHAT_LEAVE_IN_PROGRESS;//aClass635_8066
    public static ClientMessage DEBUG_CONSOLE_ERROR;//aClass635_8067
    public static ClientMessage openDeveloperConsoleMsg;//aClass635_8068
    public static ClientMessage CHATEFFECT4;//aClass635_8069
    public static ClientMessage CANCEL;//aClass635_8070
    static ClientMessage NO_NAME_PLAYERNAME;//aClass635_8071
    static ClientMessage MEMBERS_DESC;//aClass635_8072
    static ClientMessage SWAP_NOTE_AT_BANK;//aClass635_8073
    public static ClientMessage LENT_ITEM_RETURN;//aClass635_8074
    static ClientMessage UNABLE_TO_SEND_MESSAGE_PASSWORD_A;//aClass635_8075
    static ClientMessage aClass635_8076;//aClass635_8076
    static ClientMessage UNABLE_TO_SEND_MESSAGE_QUICKCHAT2;//aClass635_8077
    static ClientMessage SNAPSHOT_PLEASECLOSE1;//aClass635_8078
    public static ClientMessage TAKE;//aClass635_8079
    static ClientMessage YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION2;//aClass635_8080
    static ClientMessage OK;//aClass635_8081
    static ClientMessage SELECT;//aClass635_8082
    static ClientMessage UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_TOO_LOW_RANK;//aClass635_8083
    public static ClientMessage DEBUG_CONSOLE_INFO//aClass635_8084
		= new ClientMessage(
				"Welcome to the RuneLove Developer Console, type commands here!",
				"Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten ALT+`, ALT+\u00b2 oder ALT+\u00a7 dr\u00fccken.",
				"Ceci est la console de d\u00e9veloppement. Pour la fermer, appuyez sur les touches ALT+`, ALT+\u00b2 ou ALT+\u00a7.",
				"Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-\u00b2 ou ALT-\u00a7.",
				"Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-\u00b2 or ALT-\u00a7 en tu teclado.");
    static ClientMessage YOU_CANT_REPORT_YOURSELF;//aClass635_8085
    static ClientMessage YOU_ALREADY_SENT_A_SNAPSHOT1;//aClass635_8086
    static ClientMessage YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION1;//aClass635_8087
    static ClientMessage UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_ERROR;//aClass635_8088
    static ClientMessage YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION3;//aClass635_8089
    static ClientMessage ABUSE_REPORT_RECEIVED;//aClass635_8090
    static ClientMessage MUTED_TEMPORARY_TIME_B;//aClass635_8091
    static ClientMessage FRIENDS_CHAT_STILL_IN_CHANNEL;//aClass635_8092
    static ClientMessage USE_MEMBERS_SERVER_ITEM;//aClass635_8093
    static ClientMessage USE_MEMBERS_SERVER_LOCATION;//aClass635_8094
    static ClientMessage NOTHING_INTERESTING_HAPPENS;//aClass635_8095
    public static ClientMessage FRIENDLOGOUT;//aClass635_8096
    static ClientMessage INVALID_TELEPORT;//aClass635_8097
    static ClientMessage USE_MEMBERS_SERVER_COORD;//aClass635_8098
    static ClientMessage MAINLOAD160;//aClass635_8099
    static ClientMessage INVALID_NAME;//aClass635_8100
    public static ClientMessage IGNORELISTFULL2;//aClass635_8101
    static ClientMessage UNABLE_TO_ADD_IGNORE_EXISTS;//aClass635_8102
    public static ClientMessage FRIENDLIST_FULL2;//aClass635_8103
    static ClientMessage UNABLE_TO_SEND_MESSAGE_NOT_IN_FRIENDS_CHAT;//aClass635_8104
    static ClientMessage UNABLE_TO_DELETE_FRIEND;//aClass635_8105
    static ClientMessage UNABLE_TO_DELETE_IGNORE;//aClass635_8106
    static ClientMessage FRIENDS_CHAT_NOT_AVAILABLE;//aClass635_8107
    static ClientMessage UNABLE_TO_SEND_MESSAGE_UNAVAILABLE1;//aClass635_8108
    public static ClientMessage BOUGHT_ITEM_DISCARD;//aClass635_8109
    static ClientMessage UNABLE_TO_SEND_MESSAGE_NOTFRIEND1;//aClass635_8110
    static ClientMessage UNABLE_TO_SEND_MESSAGE_NOTFRIEND2;//aClass635_8111
    public static ClientMessage LOADINGDOTDOTDOT;//aClass635_8112
    static ClientMessage UNABLE_TO_SEND_MESSAGE_PASSWORD_B;//aClass635_8113
    static ClientMessage UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_1;//aClass635_8114
    static ClientMessage CLOSE;//aClass635_8115
    static ClientMessage UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_2;//aClass635_8116
    static ClientMessage SNAPSHOT_BUFFER_EMPTY2;//aClass635_8117
    public static ClientMessage SKILL;//aClass635_8118
    static ClientMessage UNABLE_TO_SEND_MESSAGE_QUICKCHAT1;//aClass635_8119
    static ClientMessage MAINLOAD120B;//aClass635_8120
    static ClientMessage UNABLE_TO_SEND_MESSAGE_QUICKCHATWORLD1;//aClass635_8121
    static ClientMessage CHAT_DISABLED;//aClass635_8122
    static ClientMessage UNDER13_FRIENDSCHAT_PREFIX;//aClass635_8123
    public static ClientMessage CHATCOL4;//aClass635_8124
    static ClientMessage FRIENDS_CHAT_ATTEMPTING_JOIN;//aClass635_8125
    public static ClientMessage DROP;//aClass635_8126
    static ClientMessage MAINLOAD120;//aClass635_8127
    static ClientMessage FRIENDS_CHAT_NOT_IN_CHANNEL;//aClass635_8128
    static ClientMessage UNABLE_TO_SEND_MESSAGE_BUSY;//aClass635_8129
    public static ClientMessage CHATCOL2;//aClass635_8130
    static ClientMessage UNABLE_TO_ADD_FRIEND_SYSTEM;//aClass635_8131
    static ClientMessage FRIENDS_CHAT_ENABLED_B;//aClass635_8132
    static ClientMessage FRIENDS_CHAT_INVALID_NAME;//aClass635_8133
    public static ClientMessage CONTINU;//aClass635_8134
    static ClientMessage FRIENDS_CHAT_JOIN_SUCCESS_A;//aClass635_8135
    static ClientMessage FRIENDS_CHAT_JOIN_SUCCESS_A_U13;//aClass635_8136
    static ClientMessage FRIENDS_CHAT_JOIN_ERROR;//aClass635_8137
    static ClientMessage UNABLE_TO_SEND_SNAPSHOT_BUSY;//aClass635_8138
    static ClientMessage FRIENDS_CHAT_JOIN_NOTEXIST;//aClass635_8139
    static ClientMessage FRIENDS_CHAT_JOIN_ROOMFULL;//aClass635_8140
    static ClientMessage FRIENDS_CHAT_JOIN_LOWRANK;//aClass635_8141
    static ClientMessage FRIENDS_CHAT_JOIN_BANNED;//aClass635_8142
    public static ClientMessage WALKHERE;//aClass635_8143
    static ClientMessage FRIENDS_CHAT_USER_JOINED;//aClass635_8144
    public static ClientMessage FRIENDLIST_FULL1;//aClass635_8145
    static ClientMessage FRIENDS_CHAT_USER_KICKED;//aClass635_8146
    static ClientMessage FRIENDS_CHAT_LEAVE_KICKED;//aClass635_8147
    static ClientMessage FRIENDS_CHAT_LEAVE_REMOVED;//aClass635_8148
    static ClientMessage FRIENDS_CHAT_LEAVE_DEFAULT;//aClass635_8149
    static ClientMessage FRIENDS_CHAT_ENABLED_A;//aClass635_8150
    static ClientMessage SNAPSHOT_PLEASECLOSE2;//aClass635_8151
    static ClientMessage FRIENDS_CHAT_DISABLED;//aClass635_8152
    static ClientMessage FRIENDS_CHAT_KICK_LOW_RANK;//aClass635_8153
    static ClientMessage FRIENDS_CHAT_KICK_USER_HIGHER;//aClass635_8154
    static ClientMessage FRIENDS_CHAT_KICK_NOT_FOUND;//aClass635_8155
    static ClientMessage FRIENDS_CHAT_KICK_SUCCESS;//aClass635_8156
    static ClientMessage FRIENDS_CHAT_KICK_SUCCESS_RESET;//aClass635_8157
    static ClientMessage MUTED_TEMPORARY;//aClass635_8158
    static ClientMessage MUTED_TEMPORARY_TIME_A;//aClass635_8159
    static ClientMessage MUTED_PREVENT;//aClass635_8160
    static ClientMessage MUTED_TEMPORARY_1DAY;//aClass635_8161
    public static ClientMessage CHATCOL10;//aClass635_8162
    static ClientMessage MUTED_PERMANENT;//aClass635_8163
    public static ClientMessage CHATEFFECT2;//aClass635_8164
    public static ClientMessage PROFILING;//aClass635_8165
    public static ClientMessage CONLOST;//aClass635_8166
    public static ClientMessage ATTEMPT_TO_REESTABLISH;//aClass635_8167
    public static ClientMessage CHECKING_FOR_UPDATES;//aClass635_8168
    public static ClientMessage DOWNLOADING_UPDATES;//aClass635_8169
    public static ClientMessage LOADING;//aClass635_8170
    static ClientMessage MAINLOAD110B;//aClass635_8171
    public static ClientMessage DEBUG_CONSOLE_UNKNOWNCOMMAND;//aClass635_8172
    static ClientMessage FRIENDS_CHAT_JOIN_IGNORELIST;//aClass635_8173
    static ClientMessage MAINLOAD130;//aClass635_8174
    static ClientMessage MAINLOAD130B;//aClass635_8175
    static ClientMessage MAINLOAD140;//aClass635_8176
    static ClientMessage MAINLOAD140B;//aClass635_8177
    static ClientMessage MAINLOAD150;//aClass635_8178
    static ClientMessage MAINLOAD150B;//aClass635_8179
    public static ClientMessage UNABLETOFIND;//aClass635_8180
    static ClientMessage MAINLOAD160B;//aClass635_8181
    static ClientMessage MAINLOAD170;//aClass635_8182
    static ClientMessage MAINLOAD170B;//aClass635_8183
    static ClientMessage MAINLOAD180;//aClass635_8184
    static ClientMessage MAINLOAD180B;//aClass635_8185
    static ClientMessage MAINLOAD190B;//aClass635_8186
    public static ClientMessage IGNORELISTFULL;//aClass635_8187
    static ClientMessage UNABLE_TO_ADD_FRIEND_EXISTS;//aClass635_8188
    static ClientMessage NAMEDIALOG_NOTFOUND;//aClass635_8189
    static ClientMessage SYSTEMUPDATE;//aClass635_8190
    public static ClientMessage FRIENDLOGIN;//aClass635_8191
    static ClientMessage FRIENDS_CHAT_JOIN_IN_PROGRESS;//aClass635_8192
    public static ClientMessage CHATEFFECT1;//aClass635_8193
    static ClientMessage USE;//aClass635_8194
    public static ClientMessage EXAMINE;//aClass635_8195
    static ClientMessage MAINLOAD110;//aClass635_8196
    static ClientMessage aClass635_8197;//aClass635_8197
    public static ClientMessage MOREOPTIONS;//aClass635_8198
    static ClientMessage FRIENDS_CHAT_SENDING_LEAVE_REQ;//aClass635_8199
    public static ClientMessage FACEHERE;//aClass635_8200
    public static ClientMessage LEVEL;//aClass635_8201
    static ClientMessage UNABLE_TO_SEND_MESSAGE_UNAVAILABLE2;//aClass635_8202
    public static ClientMessage CHATCOL8;//aClass635_8203
    public static ClientMessage PLEASEWAIT;//aClass635_8204
    static ClientMessage I_CANT_REACH_THAT;//aClass635_8205
    public static ClientMessage MINISEPERATOR;//aClass635_8206
    public static ClientMessage MILLION;//aClass635_8207
    public static ClientMessage MILLION_SHORT;//aClass635_8208
    public static ClientMessage THOUSAND;//aClass635_8209
    public static ClientMessage THOUSAND_SHORT;//aClass635_8210
    static ClientMessage FROM;//aClass635_8211
    public static ClientMessage SELF;//aClass635_8212
    public static ClientMessage IGNORECANTADDSELF;//aClass635_8213
    static ClientMessage SNAPSHOT_BUFFER_EMPTY1;//aClass635_8214
    public static ClientMessage FRIENDLISTDUPE;//aClass635_8215
    public static ClientMessage IGNORELISTDUPE;//aClass635_8216
    public static ClientMessage FRIENDCANTADDSELF;//aClass635_8217
    static ClientMessage UNABLE_TO_ADD_IGNORE_SYSTEM;//aClass635_8218
    static ClientMessage FRIENDLIST_TIMED_SAVE;//aClass635_8219
    public static ClientMessage REMOVEIGNORE1;//aClass635_8220
    public static ClientMessage REMOVEIGNORE2;//aClass635_8221
    public static ClientMessage REMOVEFRIEND1;//aClass635_8222
    public static ClientMessage REMOVEFRIEND2;//aClass635_8223
    public static ClientMessage CHATCOL0;//aClass635_8224
    public static ClientMessage CHATCOL1;//aClass635_8225
    static ClientMessage INVALID_PLAYER_NAME;//aClass635_8226
    public static ClientMessage CHOOSEOPTION;//aClass635_8227
    static ClientMessage FRIENDS_CHAT_USER_LEFT;//aClass635_8228
    public static ClientMessage CHATCOL5;//aClass635_8229
    public static ClientMessage CHATCOL6;//aClass635_8230
    public static ClientMessage CHATCOL7;//aClass635_8231
    public static ClientMessage aClass635_8232;//aClass635_8232
    public static ClientMessage CHATCOL9;//aClass635_8233
    public static ClientMessage CHATCOL3;//aClass635_8234
    public static ClientMessage CHATCOL11;//aClass635_8235
    public static ClientMessage RATING;//aClass635_8236
    public static ClientMessage ATTACK;//aClass635_8237
    public static ClientMessage CHATEFFECT3;//aClass635_8238
    static ClientMessage FRIENDS_CHAT_JOIN_ATTACKBLOCKED;//aClass635_8239
    public static ClientMessage CHATEFFECT5;//aClass635_8240
    static ClientMessage UNKNOWN_FRIEND_DISPLAYNAME_PLACEHOLDER;//aClass635_8241
    Map<Language, String> aMap8242 = new HashMap<Language, String>(7);
    
    static final void method13505(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 908888989 * class58.fontID;
    }
    
    public String getLocalisedMessage/*method13506*/(Language locale, short i) {
    	return (String) aMap8242.get(locale);
    }
    
    ClientMessage(String string, String string_0_, String string_1_,
	     String string_2_, String string_3_) {
		aMap8242.put(Language.LOCALE_EN, string);
		aMap8242.put(Language.aClass437_6131, string_0_);
		aMap8242.put(Language.aClass437_6130, string_1_);
		aMap8242.put(Language.aClass437_6133, string_2_);
		aMap8242.put(Language.aClass437_6136, string_3_);
    }
    
    public String method13507(Language class437) {
	return (String) aMap8242.get(class437);
    }
    
    static final void method13508(ClientScriptData class454, byte i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_4_, (byte) -14);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_4_ >> 16];
	Class221.setContextMenuOption(class58, class35, class454, 217455804);
    }
    
    static {
		DEBUG_CONSOLE_ERROR = new ClientMessage(
				"There was an error executing the command.",
				"Es gab einen Fehler beim Ausf\u00fchren des Befehls.",
				"Une erreur s'est produite lors de l'ex\u00e9cution de la commande.",
				"Houve um erro quando o comando foi executado.",
				"Se produjo un error al ejecutar el comando.");
		openDeveloperConsoleMsg = new ClientMessage(
				"The developer console can be accessed with ALT-`, ALT-\u00a7 or ALT-\u00b2.",
				"Die Entwicklerkonsole kann mit ALT+`, ALT+\u00a7 oder ALT+\u00b2 aktiviert werden.",
				"La console de d\u00e9veloppement est accessible gr\u00e2ce aux touches ALT+`, ALT+\u00a7 ou ALT+\u00b2.",
				"O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-\u00a7 ou ALT-\u00b2.",
				"Puedes acceder a la consola de desarrollador con ALT-`, ALT-\u00a7 o ALT-\u00b2.");
		DEBUG_CONSOLE_UNKNOWNCOMMAND = new ClientMessage("Unknown developer command: ", "Unbekannter Befehl: ",
				"Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");
		CANCEL = new ClientMessage("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");
		NO_NAME_PLAYERNAME = new ClientMessage("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");
		MEMBERS_DESC = new ClientMessage(
				"Login to a members' server to use this object.",
				"Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
				"Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
				"Acesse um servidor para membros para usar este objeto.",
				"Accede a un servidor para miembros para usar este objeto.");
		SWAP_NOTE_AT_BANK = new ClientMessage(
				"Swap this note at any bank for the equivalent item.",
				"Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
				"\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
				"V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.",
				"Cambia este vale en cualquier banco por el objeto equivalente.");
		LENT_ITEM_RETURN = new ClientMessage("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
		BOUGHT_ITEM_DISCARD = new ClientMessage("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
		aClass635_8076 = new ClientMessage("Combine ", "Kombiniere ", "Vous pouvez combiner ", "Voc\u00ea pode trocar ", "Puedes combinar ");
		aClass635_8197 = new ClientMessage(
				" shards of this type to receive a ",
				" dieser Fragmente, um folgenden Gegenstand herzustellen: ",
				" de ces fragments pour obtenir l'objet suivant : ",
				" desses fragmentos pelo seguinte objeto: ",
				" de estos fragmentos para obtener el siguiente objeto: ");
		aClass635_8232 = new ClientMessage("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");
		TAKE = new ClientMessage("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");
		DROP = new ClientMessage("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");
		OK = new ClientMessage("Ok", "Okay", "OK", "Ok", "OK");
		SELECT = new ClientMessage("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar", "Seleccionar");
		CONTINU = new ClientMessage("Continue", "Weiter", "Continuer", "Continuar", "Continuar");
		INVALID_PLAYER_NAME = new ClientMessage("Invalid player name.", "Unzul\u00e4ssiger Charaktername!",
				"Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.", "Nombre de jugador no v\u00e1lido.");
		YOU_CANT_REPORT_YOURSELF = new ClientMessage(
				"You can't report yourself!",
				"Du kannst dich nicht selbst melden!",
				"Vous ne pouvez pas vous signaler vous-m\u00eame !",
				"Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!",
				"\u00a1No te puedes denunciar a ti mismo!");
		YOU_ALREADY_SENT_A_SNAPSHOT1 = new ClientMessage(
				"You have sent too many abuse reports today! Do not abuse this system!",
				"Du hast heute schon zu viele Regelverst\u00f6\u00dfe gemeldet! Missbrauch das System nicht!",
				"Vous avez signal\u00e9 trop d\u2019abus pour aujourd\u2019hui. N\u2019abusez pas de ce syst\u00e8me !",
				"Voc\u00ea j\u00e1 denunciou abuso muitas vezes hoje. N\u00e3o abuse do sistema!",
				"\u00a1Ya has denunciado demasiadas infracciones hoy! \u00a1No abuses del sistema!");
		YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION1 = new ClientMessage(
				"You cannot report that person for Staff Impersonation, they are Jagex Staff.",
				"Diese Person ist ein Jagex-Mitarbeiter!",
				"Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identit\u00e9.",
				"Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.",
				"Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantaci\u00f3n de identidad.");
		YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION2 = new ClientMessage(
				"You can spot a Jagex moderator by the gold crown next to their name.",
				"Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
				"Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.",
				"Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada ao lado de seu nome.",
				"Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");
		YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION3 = new ClientMessage(
				"You can report that person under a different rule.",
				"Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.",
				"Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.",
				"Voc\u00ea pode denunciar essa pessoa por outro tipo de infra\u00e7\u00e3o.",
				"Puedes denunciar a esa persona por otro tipo de infracci\u00f3n.");
		ABUSE_REPORT_RECEIVED = new ClientMessage(
				"Thank-you, your abuse report has been received.",
				"Vielen Dank, deine Meldung ist bei uns eingegangen.",
				"Merci, nous avons bien re\u00e7u votre rapport d'abus.",
				"Obrigado. Sua den\u00fancia de abuso foi recebida.",
				"Gracias, hemos recibido tu denuncia.");
		UNABLE_TO_SEND_SNAPSHOT_BUSY = new ClientMessage(
				"Unable to send abuse report - system busy.",
				"Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet",
				"Impossible de signaler un abus - Erreur syst\u00e8me",
				"Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.",
				"Sistema ocupado. No ha sido posible enviar tu denuncia.");
		INVALID_NAME = new ClientMessage("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido", "Nombre no v\u00e1lido");
		USE_MEMBERS_SERVER_ITEM = new ClientMessage(
				"To use this item please login to a members' server.",
				"Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
				"Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
				"Acesse um servidor para membros para usar este objeto.",
				"Accede a un servidor para miembros para usar este objeto.");
		USE_MEMBERS_SERVER_LOCATION = new ClientMessage(
				"To interact with this please login to a members' server.",
				"Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
				"Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.",
				"Para interagir, acesse um servidor para membros.",
				"Para interactuar, accede a un servidor para miembros.");
		NOTHING_INTERESTING_HAPPENS = new ClientMessage(
				"Nothing interesting happens.",
				"Nichts Interessantes passiert.",
				"Il ne se passe rien d'int\u00e9ressant.",
				"Nada de interessante acontece.",
				"No sucede nada interesante.");
		I_CANT_REACH_THAT = new ClientMessage("You can't reach that.", "Da kommst du nicht hin.",
				"Vous ne pouvez pas l'atteindre.", "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.", "No puedes alcanzar eso.");
		INVALID_TELEPORT = new ClientMessage("Invalid teleport!", "Unzul\u00e4ssiger Teleport!",
				"T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!", "\u00a1Teletransporte no v\u00e1lido!");
		USE_MEMBERS_SERVER_COORD  = new ClientMessage(
				"To go here you must login to a members' server.",
				"Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
				"Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.",
				"Para entrar aqui, acesse um servidor para membros.",
				"Para entrar aqu\u00ed, debes acceder a un servidor para miembros.");
		UNABLE_TO_ADD_FRIEND_SYSTEM = new ClientMessage(
				"Unable to add friend - system busy.",
				"Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
				"Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible a\u00f1adir a un amigo.");
		UNABLE_TO_ADD_FRIEND_EXISTS = new ClientMessage(
				"Unable to add friend - unknown player.",
				"Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
				"Impossible d'ajouter l'ami - joueur inconnu.",
				"N\u00e3o foi poss\u00edvel adicionar esse amigo - jogador desconhecido.",
				"Jugador desconocido. No es posible a\u00f1adir a ese amigo.");
		UNABLE_TO_ADD_IGNORE_SYSTEM = new ClientMessage(
				"Unable to add name - system busy.",
				"Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
				"Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible a\u00f1adir el nombre.");
		UNABLE_TO_ADD_IGNORE_EXISTS = new ClientMessage(
				"Unable to add name - unknown player.",
				"Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
				"Impossible d'ajouter le nom - joueur inconnu.",
				"N\u00e3o foi poss\u00edvel adicionar esse nome - jogador desconhecido.",
				"Jugador desconocido. No es posible a\u00f1adir el nombre.");
		FRIENDLIST_FULL2 = new ClientMessage(
				"Your friends list is full (400 names maximum)",
				"Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.",
				"Votre liste d'amis est pleine (400 noms maximum).",
				"Sua lista de amigos est\u00e1 cheia. O limite \u00e9 de 400 nomes.",
				"Tu lista de amigos est\u00e1 llena. El l\u00edmite es de 400 amigos.");
		FRIENDLIST_FULL1 = new ClientMessage(
				"Your friends list is full (200 names maximum)",
				"Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.",
				"Votre liste d'amis est pleine (200 noms maximum).",
				"Sua lista de amigos est\u00e1 cheia. O limite \u00e9 de 200 nomes.",
				"Tu lista de amigos est\u00e1 llena. El l\u00edmite es de 200 amigos.");
		UNABLE_TO_DELETE_FRIEND = new ClientMessage(
				"Unable to delete friend - system busy.",
				"Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
				"Impossible de supprimer un ami - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.",
				"Servidor ocupado. No es posible borrar al amigo.");
		UNABLE_TO_DELETE_IGNORE = new ClientMessage(
				"Unable to delete name - system busy.",
				"Name konnte nicht gel\u00f6scht werden - Systemfehler.",
				"Impossible d'effacer le nom - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.",
				"Sistema ocupado. No es posible borrar el nombre.");
		UNABLE_TO_SEND_MESSAGE_BUSY = new ClientMessage(
				"Unable to send message - system busy.",
				"Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
				"Impossible d'envoyer un message - syst\u00e8me occup\u00e9.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.",
				"Sistema ocupado. No es posible enviar el mensaje.");
		UNABLE_TO_SEND_MESSAGE_UNAVAILABLE1 = new ClientMessage(
				"Unable to send message - player unavailable.",
				"Deine Nachricht konnte nicht verschickt werden,",
				"Impossible d'envoyer un message - joueur indisponible.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.",
				"No es posible enviar el mensaje, el jugador no est\u00e1 disponible.");
		UNABLE_TO_SEND_MESSAGE_UNAVAILABLE2 = new ClientMessage(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null, null);
		UNABLE_TO_SEND_MESSAGE_NOTFRIEND1 = new ClientMessage(
				"Unable to send message - player not on your friends list.",
				"Nachricht kann nicht geschickt werden,",
				"Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.",
				"N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.",
				"No es posible enviar el mensaje. El jugador no est\u00e1 en tu lista de amigos.");
		UNABLE_TO_SEND_MESSAGE_NOTFRIEND2 = new ClientMessage(null, "Spieler nicht auf deiner Freunde-Liste.", null, null, null);
		UNABLE_TO_SEND_MESSAGE_PASSWORD_A = new ClientMessage(
				"You appear to be telling someone your password - please don't!",
				"Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
				"Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !",
				"Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!",
				"Parece que le est\u00e1s revelando a alguien tu contrase\u00f1a. \u00a1No debes hacerlo!");
		UNABLE_TO_SEND_MESSAGE_PASSWORD_B = new ClientMessage(
				"If you are not, please change your password to something more obscure!",
				"nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!",
				"Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !",
				"Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!",
				"\u00a1Si no es as\u00ed, cambia tu contrase\u00f1a por una menos evidente!");
		UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_1 = new ClientMessage(
				"Unable to send message - set your display name first by logging into the game.",
				"Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ",
				"Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.",
				"N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.",
				"No es posible enviar el mensaje. Registra primero un nombre de personaje conect\u00e1ndote al juego.");
		UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_2 = new ClientMessage(null, "indem du dich ins Spiel einloggst.", null, null, null);
		SNAPSHOT_BUFFER_EMPTY1 = new ClientMessage(
				"For that rule you can only report players who have spoken or traded recently.",
				"Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,",
				"Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
				"Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.",
				"S\u00f3lo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");
		SNAPSHOT_BUFFER_EMPTY2 = new ClientMessage(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null, null);
		NAMEDIALOG_NOTFOUND = new ClientMessage(
				"That player is offline, or has privacy mode enabled.",
				"Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.",
				"Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.",
				"O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.",
				"Este jugador est\u00e1 desconectado o activ\u00f3 el modo de privacidad.");
		UNABLE_TO_SEND_MESSAGE_QUICKCHAT1 = new ClientMessage(
				"You cannot send a quick chat message to a player on this world at this time.",
				"Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten",
				"Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.",
				"Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.",
				"En estos momentos no puedes enviar un mensaje r\u00e1pido de chat a un jugador en este mundo.");
		UNABLE_TO_SEND_MESSAGE_QUICKCHAT2 = new ClientMessage(null, "geschickt werden.", null, null, null);
		UNABLE_TO_SEND_MESSAGE_QUICKCHATWORLD1 = new ClientMessage(
				"This player is on a quick chat world and cannot receive your message.",
				"Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
				"Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
				"Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.",
				"Este jugador no puede recibir su mensaje porque est\u00e1 en un mundo de chat r\u00e1pido.");
		CHAT_DISABLED = new ClientMessage("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado", "Chat desactivado");
		UNDER13_FRIENDSCHAT_PREFIX = new ClientMessage("friends_chat", "friends_chat", "friends_chat", "friends_chat", "friends_chat");
		UNABLE_TO_SEND_MESSAGE_NOT_IN_FRIENDS_CHAT = new ClientMessage(
				"You are not currently in a friends chat channel.",
		    	"Du befindest dich derzeit nicht in einem Freundes-Chatraum.",
		    	"Vous ne faites pas partie d'un canal de discussion.",
		    	"No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.",
				"Actualmente no est\u00e1s en un canal de chat entre amigos.");
		UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_TOO_LOW_RANK = new ClientMessage(
				"You are not allowed to talk in this friends chat channel.",
				"Du darfst in diesem Freundes-Chatraum nicht reden.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.",
				"Voc\u00ea n\u00e3o est\u00e1 autorizado a falar neste bate-papo entre amigos.",
				"No est\u00e1s autorizado a hablar en este canal de chat entre amigos.");
		UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_ERROR = new ClientMessage(
				"Error sending message to friends chat - please try again later!",
				"Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.",
				"Erreur lors de l'envoi de ce message \u2013 veuillez r\u00e9essayer ult\u00e9rieurement !",
				"Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!",
				"Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, int\u00e9ntalo m\u00e1s tarde.");
		FRIENDS_CHAT_STILL_IN_CHANNEL = new ClientMessage(
				"Please wait until you are logged out of your previous channel.",
				"Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
				"Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.",
				"Aguarde at\u00e9 se desconectar do canal anterior.",
				"Por favor, espera hasta haberte desconectado del anterior chat.");
		FRIENDS_CHAT_NOT_IN_CHANNEL = new ClientMessage(
				"You are not currently in a channel.",
				"Du befindest dich derzeit nicht in einem Chatraum.",
				"Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
				"No momento voc\u00ea n\u00e3o est\u00e1 em um canal.",
				"En este momento no est\u00e1s en un canal.");
		FRIENDS_CHAT_ATTEMPTING_JOIN = new ClientMessage(
				"Attempting to join channel...",
				"Chatraum wird betreten...",
				"Tentative de connexion au canal...",
				"Tentando acessar canal...",
				"Intentando acceder a un canal...");
		FRIENDS_CHAT_SENDING_LEAVE_REQ = new ClientMessage(
				"Sending request to leave channel...",
				"Chatraum wird verlassen...",
				"Envoi de la demande de sortie du canal...",
				"Enviando solicita\u00e7\u00e3o para sair do canal...",
				"Enviando solicitud para abandonar el canal...");
		FRIENDS_CHAT_JOIN_IN_PROGRESS = new ClientMessage(
				"Already attempting to join a channel - please wait...",
				"Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
				"Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...",
				"J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...",
				"Ya est\u00e1s intentando unirte a un canal. Por favor, espera...");
		FRIENDS_CHAT_LEAVE_IN_PROGRESS = new ClientMessage(
				"Leave request already in progress - please wait...",
				"Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
				"Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...",
				"Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...",
				"La salida del canal est\u00e1 proces\u00e1ndose. Por favor, espera...");
		FRIENDS_CHAT_INVALID_NAME = new ClientMessage("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.",
				"Nom de canal incorrect !", "Nome de canal inv\u00e1lido!", "\u00a1Nombre de canal no valido!");
		FRIENDS_CHAT_NOT_AVAILABLE = new ClientMessage(
				"Unable to join friends chat at this time - please try again later!",
				"Freundes-Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.",
				"Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement !",
				"N\u00e3o foi poss\u00edvel entrar no bate-papo entre amigos - tente novamente mais tarde!",
				"Ahora mismo no es posible unirse al chat entre amigos. \u00a1Por favor, int\u00e9ntalo m\u00e1s tarde!");
		FRIENDS_CHAT_JOIN_SUCCESS_A = new ClientMessage(
				"Now talking in friends chat channel ", 
				"Freundes-Chatraum: ",
				"Vous participez actuellement au canal de discussion : ", 
				"Falando agora no bate-papo entre amigos: ", 
				"Hablando ahora en el chat entre amigos: ");
		FRIENDS_CHAT_JOIN_SUCCESS_A_U13 = new ClientMessage(
				"Now talking in friends chat channel of player: ",
				"Freundes-Chat dieses Spielers beigetreten: ",
				"Vous participez actuellement au canal de discussion du joueur : ",
				"Falando agora no bate-papo entre amigos do jogador: ",
				"Hablando ahora en el canal de chat entre amigos del jugador: ");
		FRIENDS_CHAT_JOIN_ERROR = new ClientMessage(
				"Error joining friends chat channel - please try again later!",
				"Fehler beim Betreten des Freundes-Chatraums - bitte versuch es sp\u00e4ter erneut.",
				"Erreur lors de la connexion au canal de discussion - veuillez r\u00e9essayer ult\u00e9rieurement !",
				"Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!",
				"Se ha producido un error al acceder al canal de chat entre amigos. \u00a1Por favor, int\u00e9ntalo m\u00e1s tarde!");
		FRIENDS_CHAT_JOIN_ATTACKBLOCKED = new ClientMessage(
				"You are temporarily blocked from joining channels - please try again later!",
				"Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.",
				"Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.",
				"Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente novamente mais tarde!",
				"De momento tienes bloqueado el acceso a los canales chat. \u00a1Int\u00e9ntalo de nuevo m\u00e1s tarde!");
		FRIENDS_CHAT_JOIN_NOTEXIST = new ClientMessage(
				"The channel you tried to join does not exist.",
				"Der von dir gew\u00fcnschte Chatraum existiert nicht.",
				"Le canal que vous essayez de rejoindre n'existe pas.",
				"O canal que voc\u00ea tentou acessar n\u00e3o existe.",
				"El canal al que intentas unirte no existe.");
		FRIENDS_CHAT_JOIN_ROOMFULL = new ClientMessage(
				"The channel you tried to join is currently full.",
				"Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.",
				"Le canal que vous essayez de rejoindre est plein.",
				"O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.",
				"El canal al que intentas unirte est\u00e1 lleno en estos momentos.");
		FRIENDS_CHAT_JOIN_LOWRANK = new ClientMessage(
				"You do not have a high enough rank to join this friends chat channel.",
				"Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.",
				"Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de discussion.",
				"Voc\u00ea n\u00e3o tem uma classifica\u00e7\u00e3o alta o suficiente para participar deste bate-papo entre amigos.",
				"No tienes rango suficiente para unirte a este canal de chat entre amigos.");
		FRIENDS_CHAT_JOIN_BANNED = new ClientMessage(
				"You are temporarily banned from this friends chat channel.",
				"Du wurdest tempor\u00e4r von diesem Freundes-Chatraum gesperrt.",
				"Vous avez \u00e9t\u00e9 exclu temporairement de ce canal de discussion.",
				"Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.",
				"Tienes bloqueado temporalmente el acceso a este chat entre amigos.");
		FRIENDS_CHAT_JOIN_IGNORELIST = new ClientMessage(
				"You are not allowed to join this user's friends chat channel.",
				"Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de discussion de cet utilisateur.",
				"Voc\u00ea n\u00e3o pode entrar nesse bate-papo entre amigos deste usu\u00e1rio.",
				"No tienes permiso para acceder al canal de chat entre amigos de este usuario.");
		FRIENDS_CHAT_USER_JOINED = new ClientMessage(" joined the channel.", " hat den Chatraum betreten.",
				" a rejoint le canal.", " entrou no canal.",  " se ha unido al canal.");
		FRIENDS_CHAT_USER_LEFT = new ClientMessage(" left the channel.", " hat den Chatraum verlassen.",
				" a quitt\u00e9 le canal.", " saiu do canal.", " ha abandonado el canal.");
		FRIENDS_CHAT_USER_KICKED = new ClientMessage(
				" was kicked from the channel.",
				" wurde aus dem Chatraum rausgeworfen.",
				" a \u00e9t\u00e9 expuls\u00e9 du canal.",
				" foi expulso do canal.",
				" ha sido expulsado del canal.");
		FRIENDS_CHAT_LEAVE_KICKED = new ClientMessage(
				"You have been kicked from the channel.",
				"Du wurdest aus dem Chatraum rausgeworfen.",
				"Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.",
				"Voc\u00ea foi expulso do canal.",
				"Se te ha expulsado del canal.");
		FRIENDS_CHAT_LEAVE_REMOVED = new ClientMessage(
				"You have been removed from this channel.",
				"Du wurdest aus dem Chatraum entfernt.",
				"Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.",
				"Voc\u00ea foi retirado desse canal.",
				"Se te ha eliminado de este canal.");
		FRIENDS_CHAT_LEAVE_DEFAULT = new ClientMessage(
				"You have left the channel.",
				"Du hast den Chatraum verlassen.",
				"Vous avez quitt\u00e9 le canal.",
				"Voc\u00ea saiu do canal.",
				"Has salido del canal.");
		FRIENDS_CHAT_ENABLED_A = new ClientMessage(
				"Your friends chat channel has now been enabled!",
				"Dein Freundes-Chat ist jetzt eingeschaltet.",
				"Votre canal de discussion est maintenant activ\u00e9 !",
				"O seu bate-papo entre amigos foi ativado!",
				"\u00a1Tu canal de chat entre amigos est\u00e1 activado!");
		FRIENDS_CHAT_ENABLED_B = new ClientMessage(
				"Join your channel by clicking 'Join Chat' and typing: ",
				"Klick auf 'Betreten' und gib ein: ",
				"Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
				"Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ",
				"Para entrar en tu canal, haz clic sobre 'Participar' e introduce: ");
		FRIENDS_CHAT_DISABLED = new ClientMessage(
				"Your friends chat channel has now been disabled!",
				"Dein Freundes-Chat ist jetzt ausgeschaltet.",
				"Votre canal de discussion est maintenant d\u00e9sactiv\u00e9 !",
				"O seu bate-papo entre amigos foi desativado!",
				"\u00a1Tu canal de chat entre amigos ha sido desactivado!");
		FRIENDS_CHAT_KICK_LOW_RANK = new ClientMessage(
				"You do not have permission to kick users in this channel.",
				"Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.",
				"Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.",
				"No tienes autorizaci\u00f3n para expulsar a usuarios de este canal.");
		FRIENDS_CHAT_KICK_USER_HIGHER = new ClientMessage(
				"You do not have permission to kick this user.",
				"Du darfst diesen Benutzer nicht rauswerfen.",
				"Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
				"Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.",
				"No tienes autorizaci\u00f3n para expulsar a este usuario.");
		FRIENDS_CHAT_KICK_NOT_FOUND = new ClientMessage(
				"That user is not in this channel.",
				"Dieser Benutzer befindet sich nicht in diesem Chatraum.",
				"Cet utilisateur n'est pas dans ce canal.",
				"Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.",
				"Ese usuario no est\u00e1 en este canal.");
		FRIENDS_CHAT_KICK_SUCCESS = new ClientMessage(
				"Your request to kick/ban this user was successful.",
				"Der Rauswurf/die Sperrung war erfolgreich.",
				"Votre demande d'exclusion de ce joueur a \u00e9t\u00e9 accept\u00e9e.",
				"Seu pedido para expulsar/suspender este jogador foi bem sucedido.",
				"Tu petici\u00f3n de expulsar/suspender a este usuario ha sido aceptada.");
		FRIENDS_CHAT_KICK_SUCCESS_RESET = new ClientMessage(
				"Your request to refresh this user's temporary ban was successful.",
				"Die Verl\u00e4ngerung der tempor\u00e4ren Sperrung dieses Spielers war erfolgreich.",
				"Le renouvellement d'exclusion temporaire de ce joueur a \u00e9t\u00e9 accept\u00e9.",
				"Seu pedido para reiniciar a suspens\u00e3o tempor\u00e1ria deste jogador foi bem sucedido.",
				"Tu petici\u00f3n de prolongar la suspensi\u00f3n temporal de este usuario ha sido aceptada.");
		MUTED_TEMPORARY = new ClientMessage(
				"You have been temporarily muted due to breaking a rule.",
				"Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.",
				"La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.",
				"Voc\u00ea foi temporariamente vetado por ter violado uma regra.",
				"Se te ha vetado temporalmente por haber violado una regla.");
		MUTED_TEMPORARY_TIME_A = new ClientMessage(
				"This mute will remain for a further ",
				"Diese Stummschaltung gilt f\u00fcr weitere ",
				"Votre acc\u00e8s restera bloqu\u00e9 encore ",
				"Este veto permanecer\u00e1 por mais ",
				"Este veto permancere\u00e1 activo todav\u00eda durante ");
		MUTED_TEMPORARY_TIME_B = new ClientMessage(" days.", " Tage.", " jours.", " dias.", " d\u00edas.");
		MUTED_TEMPORARY_1DAY = new ClientMessage(
				"You will be un-muted within 24 hours.",
				"Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.",
				"Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.",
				"O veto ser\u00e1 retirado dentro de 24 horas.",
				"Tu veto se retirar\u00e1 dentro de las pr\u00f3ximas 24 horas.");
		MUTED_PREVENT = new ClientMessage(
				"To prevent further mutes please read the rules.",
				"Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
				"Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.",
				"Para evitar outros vetos, leia as regras.",
				"Para evitar otro veto, consulta el reglamento.");
		MUTED_PERMANENT = new ClientMessage(
				"You have been permanently muted due to breaking a rule.",
				"Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.",
				"L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.",
				"Voc\u00ea foi permanentemente vetado por ter violado uma regra.",
				"Se te ha vetado permanentemente por haber violado una regla.");
		LOADING = new ClientMessage("Loading - please wait.", "Ladevorgang - bitte warte.",
				   "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");
		PROFILING = new ClientMessage("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...", "Obteniendo perfil...");
		CONLOST = new ClientMessage("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conex\u00e3o perdida.", "Conexi\u00f3n perdida.");
		ATTEMPT_TO_REESTABLISH = new ClientMessage(
				"Please wait - attempting to reestablish.",
				"Bitte warte - es wird versucht, die Verbindung wiederherzustellen.",
				"Veuillez patienter - tentative de r\u00e9tablissement.",
				"Tentando reestabelecer conex\u00e3o. Aguarde.",
				"Estamos intentando restablecer la conexi\u00f3n. Por favor, espera.");
		CHECKING_FOR_UPDATES = new ClientMessage("Checking for updates", "Suche nach Updates",
				   "V\u00e9rification des mises \u00e0 jour", "Verificando atualiza\u00e7\u00f5es", "Buscando actualizaciones");
		DOWNLOADING_UPDATES = new ClientMessage("Fetching Updates", "Lade Update",
					      "Chargement des MAJ", "Carregando atualiza\u00e7\u00f5es", "Cargando actualizaciones");
		MAINLOAD110 = new ClientMessage("Loading config - ", "Lade Konfiguration - ",
				   "Chargement des fichiers config - ", "Carregando config - ", "Cargando configuraci\u00f3n - ");
		MAINLOAD110B = new ClientMessage("Loaded config", "Konfig geladen.",
				   "Fichiers config charg\u00e9s", "Config carregada", "Configuraci\u00f3n cargada");
		MAINLOAD120 = new ClientMessage("Loading sprites - ", "Lade Sprites - ",
				   "Chargement des sprites - ", "Carregando sprites - ", "Cargando sprites - ");
		MAINLOAD120B = new ClientMessage("Loaded sprites", "Sprites geladen.",
				   "Sprites charg\u00e9s", "Sprites carregados", "Sprites cargados");
		MAINLOAD130 = new ClientMessage("Loading wordpack - ", "Lade Wordpack - ",
				"Chargement du module texte - ", "Carregando pacote de palavras - ", "Cargando el m\u00f3dulo de texto - ");
		MAINLOAD130B = new ClientMessage("Loaded wordpack", "Wordpack geladen.",
				"Module texte charg\u00e9", "Pacote de palavras carregado", "M\u00f3dulo de texto cargado");
		MAINLOAD140 = new ClientMessage("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");
		MAINLOAD140B = new ClientMessage("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es", "Interfaces carregadas", "Interfaces cargadas");
		MAINLOAD150 = new ClientMessage("Loading interface scripts - ", "Lade Interface-Skripte - ",
					      "Chargement des interfaces - ", "Carregando scripts de interface - ", "Cargando gui\u00f3n de interfaz - ");
		MAINLOAD150B = new ClientMessage("Loaded interface scripts", "Interface-Skripte geladen",
					      "Interfaces charg\u00e9es", "Script de interface carregados", "Guiones de interfaz cargados");
		MAINLOAD160 = new ClientMessage("Loading additional fonts - ", "Lade Zusatzschriftarten - ",
					      "Chargement de polices secondaires - ", "Carregando fontes adicionais - ", "Cargando fuentes adicionales - ");
		MAINLOAD160B = new ClientMessage("Loaded additional fonts", "Zusatzschriftarten geladen",
					      "Polices secondaires charg\u00e9es", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");
		MAINLOAD170 = new ClientMessage("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ", "Cargando mapamundi - ");
		MAINLOAD170B = new ClientMessage("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado", "Mapamundi cargado");
		MAINLOAD180 = new ClientMessage("Loading world list data", "Lade Liste der Welten",
				   "Chargement de la liste des serveurs", "Carregando dados da lista de mundos", "Cargando datos de la lista de mundos");
		MAINLOAD180B = new ClientMessage("Loaded world list data", "Liste der Welten geladen",
					      "Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados", "Datos de la lista de mundos cargados");
		MAINLOAD190B = new ClientMessage("Loaded client variable data", "Client-Variablen geladen",
				   "Variables du client charg\u00e9es", "As vari\u00e1veis do sistema foram carregadas", "Variables de cliente cargadas");
		LOADINGDOTDOTDOT = new ClientMessage("Loading...", "Lade...", "Chargement en cours...", "Carregando...", "Cargando...");
		SNAPSHOT_PLEASECLOSE1 = new ClientMessage(
				"Please close the interface you have open before using 'Report Abuse'.",
				"Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
				"Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
				"Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".",
				"Cierra la interfaz que tienes abierta antes de usar el bot\u00f3n 'Denunciar abuso'.");
		SNAPSHOT_PLEASECLOSE2 = new ClientMessage(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null, null);
		SYSTEMUPDATE = new ClientMessage("System update in: ", "System-Update in: ",
				   "Mise \u00e0 jour syst\u00e8me dans : ", "Atualiza\u00e7\u00e3o do sistema em: ", "Actualizaci\u00f3n del sistema en: ");
		FRIENDLOGIN = new ClientMessage(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.", " se ha conectado.");
		FRIENDLOGOUT = new ClientMessage(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.", " saiu do jogo.", " se ha desconectado.");
		UNABLETOFIND = new ClientMessage("Unable to find ", "Spieler kann nicht gefunden werden: ",
					      "Impossible de trouver ", "N\u00e3o foi poss\u00edvel encontrar ", "No es posible encontrar a ");
		USE = new ClientMessage("Use", "Benutzen", "Utiliser", "Usar", "Usar");
		EXAMINE = new ClientMessage("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");
		ATTACK = new ClientMessage("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");
		CHOOSEOPTION = new ClientMessage("Choose Option", "W\u00e4hl eine Option", "Choisir une option", "Selecionar op\u00e7\u00e3o", "Seleccionar opci\u00f3n");
		MOREOPTIONS = new ClientMessage(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es", " m\u00e1s opciones");
		WALKHERE = new ClientMessage("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1", "Venir ac\u00e1");
		FACEHERE = new ClientMessage("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para c\u00e1", "Girar hacia ac\u00e1");
		LEVEL = new ClientMessage("level: ", "Stufe: ", "niveau ", "n\u00edvel: ", "nivel: ");
		SKILL = new ClientMessage("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ", "habilidad: ");
		RATING = new ClientMessage("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ", "clasificaci\u00f3n: ");
		PLEASEWAIT = new ClientMessage("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...", "Por favor, espera...");
		CLOSE = new ClientMessage("Close",
			"Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
			"Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
			"Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".",
			"Cierra la interfaz que tienes abierta antes de usar el bot\u00f3n 'Denunciar abuso'.");
		MINISEPERATOR = new ClientMessage(" ", ": ", " ", " ", " ");
		MILLION = new ClientMessage("M", "M", "M", "M", "M");
		MILLION_SHORT = new ClientMessage("M", "M", "M", "M", "M");
		THOUSAND = new ClientMessage("K", "T", "K", "K", "K");
		THOUSAND_SHORT = new ClientMessage("K", "T", "K", "K", "K");
		FROM = new ClientMessage("From", "Von:", "De", "De", "De");
		SELF = new ClientMessage("Self", "Mich", "Moi", "Eu", "M\u00ed");
		FRIENDLISTDUPE = new ClientMessage(
				" is already on your friends list.",
				" steht bereits auf deiner Freunde-Liste!",
				" est d\u00e9j\u00e0 dans votre liste d'amis.",
				" j\u00e1 est\u00e1 na sua lista de amigos.",
				" ya est\u00e1 en tu lista de amigos.");
		IGNORELISTFULL2 = new ClientMessage(
				"Your ignore list is full. Max of 400 users.",
				"Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.",
				"Votre liste noire est pleine (400 noms maximum).",
				"Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 de 400 usu\u00e1rios.",
				"Tu lista de jugadores ignorados est\u00e1 llena, el l\u00edmite es de 400.");
		IGNORELISTFULL = new ClientMessage(
				"Your ignore list is full. Max of 100 users.",
				"Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.",
				"Votre liste noire est pleine (100 noms maximum).",
				"Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 de 100 usu\u00e1rios.",
				"Tu lista de jugadores ignorados est\u00e1 llena, el l\u00edmite es de 100.");
		IGNORELISTDUPE = new ClientMessage(" is already on your ignore list.",
				   " steht bereits auf deiner Ignorieren-Liste!",
				   " est d\u00e9j\u00e0 dans votre liste noire.",
				   " j\u00e1 est\u00e1 na sua lista de ignorados.",
				   " ya est\u00e1 en tu lista de ignorados.");
		FRIENDCANTADDSELF = new ClientMessage(
				"You can't add yourself to your own friends list.",
				"Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
				"Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.",
				"Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.",
				"No puedes a\u00f1adirte a tu propia lista de amigos.");
		IGNORECANTADDSELF = new ClientMessage(
				"You can't add yourself to your own ignore list.",
				"Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!",
				"Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.",
				"Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados.",
				"No puedes a\u00f1adirte a tu propia lista de ignorados.");
		FRIENDLIST_TIMED_SAVE = new ClientMessage(
				"Changes will take effect on your friends chat in the next 60 seconds.",
				"Die \u00c4nderungen am Freundes-Chat werden innerhalb von 60 Sekunden \u00fcbernommen.",
				"Les modifications seront apport\u00e9s \u00e0 votre canal de discussion dans les 60 prochaines secondes.",
				"As mudan\u00e7as acontecer\u00e3o em seu bate-papo entre amigos nos pr\u00f3ximos 60 segundos.",
				"Los cambios en tu chat de amigos se realizar\u00e1n en los pr\u00f3ximos 60 segundos.");
		REMOVEIGNORE1 = new ClientMessage("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
		REMOVEIGNORE2 = new ClientMessage(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!",
					      " de votre liste noire.", " da sua lista de ignorados primeiro.", " de tu lista de ignorados.");
		REMOVEFRIEND1 = new ClientMessage("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
		REMOVEFRIEND2 = new ClientMessage(" from your friends list first.", " zuerst von deiner Freunde-Liste!",
					      " de votre liste d'amis.", " da sua lista de amigos primeiro.", " de tu lista de amigos.");
		CHATCOL0 = new ClientMessage("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");
		CHATCOL1 = new ClientMessage("red:", "rot:", "rouge:", "vermelho:", "rojo:");
		CHATCOL2 = new ClientMessage("green:", "gr\u00fcn:", "vert:", "verde:", "verde:");
		CHATCOL3 = new ClientMessage("cyan:", "blaugr\u00fcn:", "cyan:", "ciano:", "cian:");
		CHATCOL4 = new ClientMessage("purple:", "lila:", "violet:", "roxo:", "violeta:");
		CHATCOL5 = new ClientMessage("white:", "weiss:", "blanc:", "branco:", "blanco:");
		CHATCOL6 = new ClientMessage("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");
		CHATCOL7 = new ClientMessage("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");
		CHATCOL8 = new ClientMessage("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");
		CHATCOL9 = new ClientMessage("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");
		CHATCOL10 = new ClientMessage("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");
		CHATCOL11 = new ClientMessage("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");
		CHATEFFECT1 = new ClientMessage("wave:", "welle:", "ondulation:", "onda:", "onda:");
		CHATEFFECT2 = new ClientMessage("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");
		CHATEFFECT3 = new ClientMessage("shake:", "sch\u00fctteln:", "tremblement:", "tremor:", "temblor:");
		CHATEFFECT4 = new ClientMessage("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:", "desplazar:");
		CHATEFFECT5 = new ClientMessage("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");
		UNKNOWN_FRIEND_DISPLAYNAME_PLACEHOLDER = new ClientMessage("Friend", "Freund", "Ami", "Amigo", "Amigo");
    }
    
    static final void method13509(ClientScriptData class454, int i) {
	if (Class119.aClass578_1564.isKeyPressed(81, -1016346882))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    public static void method13510(int i) {
	Class622.aClass429_7878 = new NodeCollection();
    }
    
    static final void method13511(ClientScriptData class454, byte i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
		  .method7880(i_5_, 996762312);
    }
    
    static final void method13512(ClientScriptData class454, byte i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_6_ != Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub4_8850.method14107(-941318582)) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850,
		 i_6_, (byte) 2);
	    Class167.method3600((short) -5839);
	    client.aBool8297 = false;
	    client.aClass238_8477.method4768((byte) 5);
	}
    }
    
    public static boolean method13513(int i, int i_7_) {
	return 1 == i || 3 == i || 5 == i;
    }
}
