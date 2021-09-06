package visao;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Concedente extends JPanel {
	private JTextField textFieldRazaoSocial;
	private JTextField textFieldTelefone;
	private JTextField textFieldCargoRepresentante;
	private JTextField textFieldEndereco;
	private JTextField textFieldCidade;
	private JTextField textFieldCnpj;
	private JTextField textFieldRepresentante;
	private JTextField textFieldCep;
	private JTextField textFieldEstado;
	private JTextField textFieldBairro;
	private JButton btnCadastrar;
	private JButton btnAtualizar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnRemover;
	
	/**
	 * Create the panel.
	 */
	public Concedente() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(Concedente.class.getResource("/icons/add-documents (1).png")));
		btnCadastrar.setBackground(new Color(102, 204, 255));
		panel.add(btnCadastrar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Concedente.class.getResource("/icons/refresh (1).png")));
		btnAtualizar.setBackground(new Color(102, 204, 255));
		panel.add(btnAtualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(Concedente.class.getResource("/icons/preview.png")));
		btnConsultar.setBackground(new Color(102, 204, 255));
		panel.add(btnConsultar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Concedente.class.getResource("/icons/broom.png")));
		btnLimpar.setBackground(new Color(102, 204, 255));
		panel.add(btnLimpar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setIcon(new ImageIcon(Concedente.class.getResource("/icons/bin.png")));
		btnRemover.setBackground(new Color(102, 204, 255));
		panel.add(btnRemover);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Raz\u00E3o Social");
		panel_1.add(lblNewLabel, "cell 0 1,alignx center");
		
		textFieldRazaoSocial = new JTextField();
		panel_1.add(textFieldRazaoSocial, "cell 1 1,growx");
		textFieldRazaoSocial.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CNPJ");
		panel_1.add(lblNewLabel_5, "cell 2 1,alignx center");
		
		textFieldCnpj = new JTextField();
		panel_1.add(textFieldCnpj, "cell 3 1,growx");
		textFieldCnpj.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		panel_1.add(lblNewLabel_1, "cell 0 3,alignx center");
		
		textFieldTelefone = new JTextField();
		panel_1.add(textFieldTelefone, "cell 1 3,growx");
		textFieldTelefone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Representante");
		panel_1.add(lblNewLabel_6, "cell 2 3,alignx center");
		
		textFieldRepresentante = new JTextField();
		panel_1.add(textFieldRepresentante, "cell 3 3,growx");
		textFieldRepresentante.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo Representante");
		panel_1.add(lblNewLabel_2, "cell 0 5,alignx center");
		
		textFieldCargoRepresentante = new JTextField();
		panel_1.add(textFieldCargoRepresentante, "cell 1 5,growx");
		textFieldCargoRepresentante.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("CEP");
		panel_1.add(lblNewLabel_7, "cell 2 5,alignx center");
		
		textFieldCep = new JTextField();
		panel_1.add(textFieldCep, "cell 3 5,growx");
		textFieldCep.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o");
		panel_1.add(lblNewLabel_3, "cell 0 7,alignx center");
		
		textFieldEndereco = new JTextField();
		panel_1.add(textFieldEndereco, "cell 1 7,growx");
		textFieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Estado");
		panel_1.add(lblNewLabel_8, "cell 2 7,alignx center");
		
		textFieldEstado = new JTextField();
		panel_1.add(textFieldEstado, "cell 3 7,growx");
		textFieldEstado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade");
		panel_1.add(lblNewLabel_4, "cell 0 9,alignx center");
		
		textFieldCidade = new JTextField();
		panel_1.add(textFieldCidade, "cell 1 9,growx");
		textFieldCidade.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Bairro");
		panel_1.add(lblNewLabel_9, "cell 2 9,alignx center");
		
		textFieldBairro = new JTextField();
		panel_1.add(textFieldBairro, "cell 3 9,growx");
		textFieldBairro.setColumns(10);

	}

	public JTextField getTextFieldRazaoSocial() {
		return textFieldRazaoSocial;
	}

	public void setTextFieldRazaoSocial(JTextField textFieldRazaoSocial) {
		this.textFieldRazaoSocial = textFieldRazaoSocial;
	}

	public JTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}

	public void setTextFieldTelefone(JTextField textFieldTelefone) {
		this.textFieldTelefone = textFieldTelefone;
	}

	public JTextField getTextFieldCargoRepresentante() {
		return textFieldCargoRepresentante;
	}

	public void setTextFieldCargoRepresentante(JTextField textFieldCargoRepresentante) {
		this.textFieldCargoRepresentante = textFieldCargoRepresentante;
	}

	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}

	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}

	public JTextField getTextFieldCidade() {
		return textFieldCidade;
	}

	public void setTextFieldCidade(JTextField textFieldCidade) {
		this.textFieldCidade = textFieldCidade;
	}

	public JTextField getTextFieldCnpj() {
		return textFieldCnpj;
	}

	public void setTextFieldCnpj(JTextField textFieldCnpj) {
		this.textFieldCnpj = textFieldCnpj;
	}

	public JTextField getTextFieldRepresentante() {
		return textFieldRepresentante;
	}

	public void setTextFieldRepresentante(JTextField textFieldRepresentante) {
		this.textFieldRepresentante = textFieldRepresentante;
	}

	public JTextField getTextFieldCep() {
		return textFieldCep;
	}

	public void setTextFieldCep(JTextField textFieldCep) {
		this.textFieldCep = textFieldCep;
	}

	public JTextField getTextFieldEstado() {
		return textFieldEstado;
	}

	public void setTextFieldEstado(JTextField textFieldEstado) {
		this.textFieldEstado = textFieldEstado;
	}

	public JTextField getTextFieldBairro() {
		return textFieldBairro;
	}

	public void setTextFieldBairro(JTextField textFieldBairro) {
		this.textFieldBairro = textFieldBairro;
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
