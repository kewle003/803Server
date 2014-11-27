import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;

/**
 * An Applet used for loading the RS3 Client.
 * @author Im Frizzy <Skype:kfriz1998>
 */
public class RS3Applet extends Applet implements AppletStub {

	/**
	 * An generated serial UID.
	 */
	private static final long serialVersionUID = 1670498001014004354L;
	
	public static final String LOBBY_ADDR = "127.0.0.1";
	
	static BigInteger RSA_MODULUS = new BigInteger("92952295964155672087801015402111750591919500795257231765611346743023141259087751200849540075517787992536588533840502270599726488785462782810450546358220539026800123618215080154270389875550255531705255494326594317637443265761822792347000385003452391742987636722632882107837694393096626546031683632300323372031");

	static BigInteger RSA_PUBLIC_KEY = new BigInteger("65537");
	
	public static final boolean DEBUG = false;
	
	public static final boolean USING_ISAAC = false;
	
	/**
	 * The parameters of the client.
	 */
	private Properties client_parameters = new Properties();
	
	/**
	 * The current frame of the client application.
	 */
	public JFrame clientFrame = null;
	
	/**
	 * Chooses the Host
	 */
	public static String JS5_HOST = "http://127.0.0.1";
	
	/**
	 * The main entry point of the current application.
	 * @param args The command line arguments.
	 */
	public static void main(String... args) {
		RS3Applet rs3applet = new RS3Applet();
		rs3applet.doFrame();
	}
	
	/**
	 * Performs the operations needed to show the client.
	 */
	private void doFrame() {
		readParameters();
		openFrame();
		startClient();
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	/**
	 * Starts the actual client.
	 */
	private void startClient() {
		try {
			client RS3Client = new client();
			RS3Client.supplyApplet(this);
			RS3Client.init();
			RS3Client.start();			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Opens the actual frame application.
	 */
	private void openFrame() {
		clientFrame = new JFrame("Client 803");
		clientFrame.add(this);
		clientFrame.setVisible(true);
		clientFrame.setSize(800, 600);		
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 */
	private void readParameters() {
		//client_parameters.put("centerimage", "true");
		//client_parameters.put("boxborder", "false");
		//client_parameters.put("image", "http://www.runescape.com/img/game/splash6.gif");
		//client_parameters.put("separate_jvm", "true");
		//client_parameters.put("java_arguments", "-Xmx384m");
		//client_parameters.put("boxbgcolor", "black");
		client_parameters.put("0", "dtBFi9*5TmY5K-RGfI6ilw");
		//client_parameters.put("13", "false");
		client_parameters.put("34", "");
		client_parameters.put("28", "false");
		client_parameters.put("42", "");
		client_parameters.put("33", JS5_HOST);//"http://world12.runescape.com"
		client_parameters.put("40", "12");
		client_parameters.put("10", "0");
		client_parameters.put("36", "false");
		client_parameters.put("8", "false");
		client_parameters.put("12", "0");
		client_parameters.put("6", "0");
		client_parameters.put("22", "false");
		client_parameters.put("-1", "06FCnu1ySFQQTM7xBXUsFA");
		client_parameters.put("18", "4786");
		client_parameters.put("37", "2036579457");
		client_parameters.put("41", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("7", "");
		client_parameters.put("11", ".runescape.com");
		client_parameters.put("3", "false");
		client_parameters.put("39", "");
		client_parameters.put("4", "");
		client_parameters.put("31", JS5_HOST);//"http://world12.runescape.com"
		client_parameters.put("9", "0");
		client_parameters.put("23", LOBBY_ADDR);//"lobby15.runescape.com"
		client_parameters.put("20", "0");
		client_parameters.put("15", "true");
		client_parameters.put("38", "0");
		client_parameters.put("30", "166");
		client_parameters.put("24", "0");
		client_parameters.put("29", "");
		client_parameters.put("2", "");//"http://services.runescape.com/m=gamelogspecs/clientstats?data="
		client_parameters.put("1", "BgTFo+lHy/lilpFjXLk4n6pf9X/x/B6L");
		client_parameters.put("16", "false");
		client_parameters.put("27", "1114");
		client_parameters.put("32", "false");
		client_parameters.put("17", LOBBY_ADDR);//"lobby17.runescape.com"
		client_parameters.put("35", "1116");
		client_parameters.put("5", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
		client_parameters.put("14", "0");
		//client_parameters.put("haveie6", "false");
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) client_parameters.get(paramName);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL(JS5_HOST);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL(JS5_HOST);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
