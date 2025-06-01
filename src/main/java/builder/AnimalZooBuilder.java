package builder;

import java.util.Date;

public class AnimalZooBuilder {

    private AnimalZoo animal;

    public AnimalZooBuilder() {
        animal = new AnimalZoo();
    }

    public AnimalZoo build() {
        if (animal.getEspecie().isEmpty()) {
            throw new IllegalArgumentException("Espécie inválida");
        }
        if (animal.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return animal;
    }

    public AnimalZooBuilder setEspecie(String especie) {
        animal.setEspecie(especie);
        return this;
    }

    public AnimalZooBuilder setNome(String nome) {
        animal.setNome(nome);
        return this;
    }

    public AnimalZooBuilder setSexo(String sexo) {
        animal.setSexo(sexo);
        return this;
    }

    public AnimalZooBuilder setDataNascimento(Date dataNascimento) {
        animal.setDataNascimento(dataNascimento);
        return this;
    }

    public AnimalZooBuilder setPaisOrigem(String paisOrigem) {
        animal.setPaisOrigem(paisOrigem);
        return this;
    }

    public AnimalZooBuilder setHabitatNatural(String habitatNatural) {
        animal.setHabitatNatural(habitatNatural);
        return this;
    }

    public AnimalZooBuilder setPeso(double peso) {
        animal.setPeso(peso);
        return this;
    }

    public AnimalZooBuilder setAltura(double altura) {
        animal.setAltura(altura);
        return this;
    }

    public AnimalZooBuilder setDieta(String dieta) {
        animal.setDieta(dieta);
        return this;
    }

    public AnimalZooBuilder setEmExtincao(boolean emExtincao) {
        animal.setEmExtincao(emExtincao);
        return this;
    }

    public AnimalZooBuilder setSetorZoologico(String setorZoologico) {
        animal.setSetorZoologico(setorZoologico);
        return this;
    }

    public AnimalZooBuilder setNomeVeterinarioResponsavel(String nomeVeterinarioResponsavel) {
        animal.setNomeVeterinarioResponsavel(nomeVeterinarioResponsavel);
        return this;
    }

    public AnimalZooBuilder setDataUltimoExame(Date dataUltimoExame) {
        animal.setDataUltimoExame(dataUltimoExame);
        return this;
    }

    public AnimalZooBuilder setVacinas(String vacinas) {
        animal.setVacinas(vacinas);
        return this;
    }

    public AnimalZooBuilder setComportamento(String comportamento) {
        animal.setComportamento(comportamento);
        return this;
    }

    public AnimalZooBuilder setIdentificadorChip(String identificadorChip) {
        animal.setIdentificadorChip(identificadorChip);
        return this;
    }
}
