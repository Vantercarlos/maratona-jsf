package com.vantercarlos.maratonajsf.bean.estudante;

import com.vantercarlos.maratonajsf.model.Estudante;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class EstudanteRegistrarBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevJunior", "DevPleno", "DevSenior"};
    private List<String> nomesList = asList("DevJunior-n1", "DevPleno-n2", "DevSenior-n3");
    private Set<String> nomesSet = new HashSet<>(asList("DevJunior-v1", "DevPleno-v2", "DevSenior-v3"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("DevJunior", "DevJunior-v1");
        nomesMap.put("DevPleno", "DevPleno-v2");
        nomesMap.put("DevSenior", "DevSenior-v3");

        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
            nomesMap.put(entry.getKey(), entry.getValue());
        }
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }
}
