package builder;

import java.util.Date;

public class AnimalZoo {

    private String especie;
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private String paisOrigem;
    private String habitatNatural;
    private double peso;
    private double altura;
    private String dieta;
    private boolean emExtincao;
    private String setorZoologico;
    private String nomeVeterinarioResponsavel;
    private Date dataUltimoExame;
    private String vacinas;
    private String comportamento;
    private String identificadorChip;

    public AnimalZoo() {
        this.especie = "";
        this.nome = "";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public boolean isEmExtincao() {
        return emExtincao;
    }

    public void setEmExtincao(boolean emExtincao) {
        this.emExtincao = emExtincao;
    }

    public String getSetorZoologico() {
        return setorZoologico;
    }

    public void setSetorZoologico(String setorZoologico) {
        this.setorZoologico = setorZoologico;
    }

    public String getNomeVeterinarioResponsavel() {
        return nomeVeterinarioResponsavel;
    }

    public void setNomeVeterinarioResponsavel(String nomeVeterinarioResponsavel) {
        this.nomeVeterinarioResponsavel = nomeVeterinarioResponsavel;
    }

    public Date getDataUltimoExame() {
        return dataUltimoExame;
    }

    public void setDataUltimoExame(Date dataUltimoExame) {
        this.dataUltimoExame = dataUltimoExame;
    }

    public String getVacinas() {
        return vacinas;
    }

    public void setVacinas(String vacinas) {
        this.vacinas = vacinas;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getIdentificadorChip() {
        return identificadorChip;
    }

    public void setIdentificadorChip(String identificadorChip) {
        this.identificadorChip = identificadorChip;
    }
}
