package curso.springboot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message="Nome não pode ser nulo")
	@NotEmpty(message = "Nome não pode ser vazio")
	private String nome;

	@NotNull(message = "Sobrenome não pode ser nulo")
	@NotEmpty(message = "Sobrenome não pode ser vazio")
	private String sobrenome;
	
	@Min(value = 18, message = "Idade inválida")
	private int idade;
	
	private String cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	private String ibge;
	
	private String sexopessoa;
	
	@OneToMany(mappedBy="pessoa", orphanRemoval= true, cascade = CascadeType.ALL)
	private List<Telefone> telefones;
	
	public void setSexopessoa(String sexopessoa) {
		this.sexopessoa = sexopessoa;
	}
	
	public String getSexopessoa() {
		return sexopessoa;
	}
	
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
