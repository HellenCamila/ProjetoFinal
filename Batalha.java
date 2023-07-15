
//* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 //*/
package sp.senai.br.trabalhofinalpar1;

/**
 *
 * @author aluno
 */
public class Batalha {
    
    private int qtdTurnoLimete;
    private int qtdTurnoAtual;
    
    private  Personagem personagemUm;
    private Personagem personagemDois;
    
    private int personagemUmVitorias;
    private int personagemDoisVitorias;
  
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    public boolean emAndamento = true;

    public int getQtdTurnoLimete() {
        return qtdTurnoLimete;
    }

    public void setQtdTurnoLimete(int qtdTurnoLimete) {
        this.qtdTurnoLimete = qtdTurnoLimete;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return personagemUm;
    }

    public void setPersonagemUm(Personagem personagemUm) {
        this.personagemUm = personagemUm;
    }

    public Personagem getPersonagemDois() {
        return personagemDois;
    }

    public void setPersonagemDois(Personagem personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemUmVitorias() {
        return personagemUmVitorias;
    }

    public void setPersonagemUmVitorias(int personagemUmVitorias) {
        this.personagemUmVitorias = personagemUmVitorias;
    }

    public int getPersonagemDoisVitorias() {
        return personagemDoisVitorias;
    }

    public void setPersonagemDoisVitorias(int personagemDoisVitorias) {
        this.personagemDoisVitorias = personagemDoisVitorias;
    }
    
    
    
    public void ataquePersonagemUm(){
        this.personagemUm.consumirMana(this.ataqueUm.getDanoFisico());
        this.personagemUm.consumirStamina(this.ataqueUm.getRequisitoMana());
                   
        this.personagemDois.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
        this. personagemDois.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
        System.out.println("Ataque personagem 1 > personagem 2");
    }
    
    
    public void ataquePersonagemDois(){
        this.personagemDois.consumirMana(this.ataqueDois.getDanoFisico());
        this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoMana());
                   
        this.personagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
        this.personagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
        System.out.println("Ataque personagem 2 > personagem 1");
    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
}
