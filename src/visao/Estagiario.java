package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Estagiario extends JPanel {
	private JTextField textFieldCpf;
	private JTextField textFieldCep;
	private JTextField textFieldNome;
	private JTextField textFieldData;
	private JTextField textFieldSexo;
	private JTextField textFieldTelefone;
	private JTextField textFieldCelular;
	private JTextField textFieldEndereco;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;
	private JTextField textFieldCurso;
	private JTextField textFieldIngresso;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	/**
	 * Create the panel.
	 */
	public Estagiario() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(102, 204, 255));
		btnCadastrar.setIcon(new ImageIcon(Estagiario.class.getResource("/icons/add-documents (1).png")));
		panel.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(102, 204, 255));
		btnAtualizar.setIcon(new ImageIcon(Estagiario.class.getResource("/icons/refresh (1).png")));
		panel.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(102, 204, 255));
		btnConsultar.setIcon(new ImageIcon(Estagiario.class.getResource("/icons/preview.png")));
		panel.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(102, 204, 255));
		btnLimpar.setIcon(new ImageIcon(Estagiario.class.getResource("/icons/broom.png")));
		panel.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(102, 204, 255));
		btnRemover.setIcon(new ImageIcon(Estagiario.class.getResource("/icons/bin.png")));
		panel.add(btnRemover);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][][][][]"));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCpf, "cell 0 1,alignx center");
		
		textFieldCpf = new JTextField();
		panel_1.add(textFieldCpf, "cell 1 1,grow");
		textFieldCpf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CEP");
		panel_1.add(lblNewLabel_1, "cell 2 1,alignx center");
		
		textFieldCep = new JTextField();
		panel_1.add(textFieldCep, "cell 3 1,grow");
		textFieldCep.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		panel_1.add(lblNome, "cell 0 3,alignx center");
		
		textFieldNome = new JTextField();
		panel_1.add(textFieldNome, "cell 1 3,grow");
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Endere\u00E7o");
		panel_1.add(lblNewLabel_7, "cell 2 3,alignx center");
		
		textFieldEndereco = new JTextField();
		panel_1.add(textFieldEndereco, "cell 3 3,grow");
		textFieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		panel_1.add(lblNewLabel_3, "cell 0 5,alignx center");
		
		textFieldSexo = new JTextField();
		panel_1.add(textFieldSexo, "cell 1 5,grow");
		textFieldSexo.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Bairro");
		panel_1.add(lblNewLabel_8, "cell 2 5,alignx center");
		
		textFieldBairro = new JTextField();
		panel_1.add(textFieldBairro, "cell 3 5,grow");
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data");
		panel_1.add(lblNewLabel_4, "cell 0 7,alignx center");
		
		textFieldData = new JTextField();
		panel_1.add(textFieldData, "cell 1 7,grow");
		textFieldData.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cidade");
		panel_1.add(lblNewLabel_9, "cell 2 7,alignx center");
		
		textFieldCidade = new JTextField();
		panel_1.add(textFieldCidade, "cell 3 7,grow");
		textFieldCidade.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone");
		panel_1.add(lblNewLabel_5, "cell 0 9,alignx center");
		
		textFieldTelefone = new JTextField();
		panel_1.add(textFieldTelefone, "cell 1 9,grow");
		textFieldTelefone.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Curso");
		panel_1.add(lblNewLabel_10, "cell 2 9,alignx center");
		
		textFieldCurso = new JTextField();
		panel_1.add(textFieldCurso, "cell 3 9,grow");
		textFieldCurso.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Celular");
		panel_1.add(lblNewLabel_6, "cell 0 11,alignx center,aligny baseline");
		
		textFieldCelular = new JTextField();
		panel_1.add(textFieldCelular, "cell 1 11,grow");
		textFieldCelular.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Ingresso");
		panel_1.add(lblNewLabel_11, "cell 2 11,alignx center");
		
		textFieldIngresso = new JTextField();
		panel_1.add(textFieldIngresso, "cell 3 11,grow");
		textFieldIngresso.setColumns(10);

	}
	public JTextField getTextFieldCpf() {
		return textFieldCpf;
	}
	public void setTextFieldCpf(JTextField textFieldCpf) {
		this.textFieldCpf = textFieldCpf;
	}
	public JTextField getTextFieldCep() {
		return textFieldCep;
	}
	public void setTextFieldCep(JTextField textFieldCep) {
		this.textFieldCep = textFieldCep;
	}
	public JTextField getTextFieldNome() {
		return textFieldNome;
	}
	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}
	public JTextField getTextFieldData() {
		return textFieldData;
	}
	public void setTextFieldData(JTextField textFieldData) {
		this.textFieldData = textFieldData;
	}
	public JTextField getTextFieldSexo() {
		return textFieldSexo;
	}
	public void setTextFieldSexo(JTextField textFieldSexo) {
		this.textFieldSexo = textFieldSexo;
	}
	public JTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}
	public void setTextFieldTelefone(JTextField textFieldTelefone) {
		this.textFieldTelefone = textFieldTelefone;
	}
	public JTextField getTextFieldCelular() {
		return textFieldCelular;
	}
	public void setTextFieldCelular(JTextField textFieldCelular) {
		this.textFieldCelular = textFieldCelular;
	}
	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}
	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}
	public JTextField getTextFieldBairro() {
		return textFieldBairro;
	}
	public void setTextFieldBairro(JTextField textFieldBairro) {
		this.textFieldBairro = textFieldBairro;
	}
	public JTextField getTextFieldCidade() {
		return textFieldCidade;
	}
	public void setTextFieldCidade(JTextField textFieldCidade) {
		this.textFieldCidade = textFieldCidade;
	}
	public JTextField getTextFieldCurso() {
		return textFieldCurso;
	}
	public void setTextFieldCurso(JTextField textFieldCurso) {
		this.textFieldCurso = textFieldCurso;
	}
	public JTextField getTextFieldIngresso() {
		return textFieldIngresso;
	}
	public void setTextFieldIngresso(JTextField textFieldIngresso) {
		this.textFieldIngresso = textFieldIngresso;
	}
	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}
	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}
	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}
	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}
	public JButton getBtnConsultar() {
		return btnConsultar;
	}
	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}
	public JButton getBtnLimpar() {
		return btnLimpar;
	}
	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	public JButton getBtnRemover() {
		return btnRemover;
	}
	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}

}
