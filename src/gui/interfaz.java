package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Choice;

public class interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("League of Legends Champions Roulette");
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblTitle = new JLabel("League of Legends Champions Roulette");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Verdana", Font.BOLD, 17));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 45, 492, 25);
		contentPane.add(lblTitle);
		
		JButton btnRandom = new JButton("Random");
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
String[] champs = new String[160];
				
				champs[0] = "Aatrox";
				champs[1] = "Ahri";
				champs[2] = "Akali";
				champs[3] = "Akshan";
				champs[4] = "Alistar";
				champs[5] = "Amumu";
				champs[6] = "Anivia";
				champs[7] = "Annie";
				champs[8] = "Aphelios";
				champs[9] = "Ashe";
				champs[11] = "Aurelion Sol";
				champs[12] = "Azir";
				champs[13] = "Bardo";
				champs[14] = "Blitzcrank";
				champs[15] = "Brand";
				champs[16] = "Braum";
				champs[17] = "Caitlyn";
				champs[18] = "Camille";
				champs[19] = "Cassiopeia";
				champs[20] = "Cho`gath";
				champs[21] = "Corki";
				champs[22] = "Darius";
				champs[23] = "Diana";
				champs[24] = "Dr. Mundo";
				champs[25] = "Draven";
				champs[26] = "Ekko";
				champs[27] = "Elise";
				champs[28] = "Evelynn";
				champs[29] = "Ezreal";
				champs[30] = "Fiddlesticks";
				champs[31] = "Fiora";
				champs[32] = "Fizz";
				champs[33] = "Galio";
				champs[34] = "Gangplank";
				champs[35] = "Garen";
				champs[36] = "Gnar";
				champs[37] = "Gragas";
				champs[38] = "Graves";
				champs[39] = "Gwen";
				champs[40] = "Hecarim";
				champs[41] = "Heimerdinger";
				champs[42] = "Illaoi";
				champs[43] = "Irelia";
				champs[44] = "Ivern";
				champs[45] = "Janna";
				champs[46] = "Jarvan IV";
				champs[47] = "Jax";
				champs[48] = "Jayce";
				champs[49] = "Jhin";
				champs[50] = "Jinx";
				champs[51] = "Kai`sa";
				champs[52] = "Kalista";
				champs[53] = "Karma";
				champs[55] = "Karthus";
				champs[56] = "Kassadin";
				champs[57] = "Katarina";
				champs[58] = "Kayle";
				champs[59] = "Kayn";
				champs[60] = "Kennen";
				champs[61] = "Kha`Zix";
				champs[62] = "Kindred";
				champs[63] = "Kled";
				champs[64] = "Kog`maw";
				champs[65] = "LeBlanc";
				champs[66] = "Lee Sin";
				champs[67] = "Leona";
				champs[68] = "Lissandra";
				champs[69] = "Lucian";
				champs[70] = "Lulu";
				champs[71] = "Lux";
				champs[72] = "Maestro Yi";
				champs[73] = "Malphite";
				champs[74] = "Malzahar";
				champs[75] = "Maokai";
				champs[76] = "Miss Fortune";
				champs[77] = "Mordekaiser";
				champs[78] = "Morgana";
				champs[79] = "Nami";
				champs[80] = "Nasus";
				champs[81] = "Nautilus";
				champs[82] = "Neeko";
				champs[83] = "Nidalee";
				champs[84] = "Nocturne";
				champs[85] = "Nunu y Willump";
				champs[86] = "Olaf";
				champs[87] = "Orianna";
				champs[88] = "Ornn";
				champs[89] = "Pantheon";
				champs[90] = "Poppy";
				champs[91] = "Pyke";
				champs[92] = "Qiyana";
				champs[93] = "Quinn";
				champs[94] = "Rakan";
				champs[95] = "Rammus";
				champs[96] = "Rek`sai";
				champs[97] = "Rell";
				champs[98] = "Renata Glasc";
				champs[99] = "Renekton";
				champs[100] = "Rengar";
				champs[101] = "Riven";
				champs[102] = "Rumble";
				champs[103] = "Ryze";
				champs[104] = "Samira";
				champs[105] = "Sejuani";
				champs[106] = "Senna";
				champs[107] = "Seraphine";
				champs[108] = "Sett";
				champs[109] = "Shaco";
				champs[110] = "Shen";
				champs[111] = "Shyvana";
				champs[112] = "Singed";
				champs[113] = "Sion";
				champs[114] = "Sivir";
				champs[115] = "Skarner";
				champs[116] = "Sona";
				champs[117] = "Soraka";
				champs[118] = "Swain";
				champs[119] = "Sylas";
				champs[120] = "Syndra";
				champs[121] = "Tahm Kench";
				champs[122] = "Taliyah";
				champs[123] = "Talon";
				champs[124] = "Taric";
				champs[125] = "Teemo";
				champs[126] = "Thresh";
				champs[127] = "Tristana";
				champs[128] = "Trundle";
				champs[129] = "Tryndamere";
				champs[130] = "Twisted Fate";
				champs[131] = "Twitch";
				champs[132] = "Udyr";
				champs[133] = "Urgot";
				champs[134] = "Varus";
				champs[135] = "Vayne";
				champs[136] = "Veigar";
				champs[137] = "Vel`koz";
				champs[138] = "Vex";
				champs[139] = "Vi";
				champs[140] = "Viego";
				champs[141] = "Viktor";
				champs[142] = "Vladimir";
				champs[143] = "Volibear";
				champs[144] = "Warwick";
				champs[145] = "Wukong";
				champs[146] = "Xayah";
				champs[147] = "Xerath";
				champs[148] = "Xin Zhao";
				champs[149] = "Yasuo";
				champs[150] = "Yone";
				champs[151] = "Yorick";
				champs[152] = "Yummi";
				champs[153] = "Zac";
				champs[154] = "Zed";
				champs[155] = "Zeri";
				champs[156] = "Ziggs";
				champs[157] = "Zilean";
				champs[158] = "Zoe";
				champs[159] = "Zyra";
				
				
			String resultado = champs[(int)(Math.random() * 160)];
			
			JOptionPane.showMessageDialog(null, "Tendras que jugar " + resultado);
					
			}

			
		});
		btnRandom.setBounds(188, 339, 108, 23);
		contentPane.add(btnRandom);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 492, 25);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("data/8-87670_best-game-kayn-league-of-legends-wallpaper-league.jpg"));
		lblNewLabel.setBounds(0, 11, 512, 412);
		contentPane.add(lblNewLabel);
	}
}
