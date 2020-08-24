package com.mindhunter.springboot.thymeleafdemo.entity.project.user;

import javax.persistence.*;
import java.util.List;

@Entity
public class RegularGenericUser extends GenericUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ElementCollection
    private List<String> bankAccounts;

    @OneToMany(mappedBy = "regularUser")
    private List<UserTicket> userTickets;

    public RegularGenericUser() {
    }

    public RegularGenericUser(List<String> bankAccounts, List<UserTicket> userTickets) {
        this.bankAccounts = bankAccounts;
        this.userTickets = userTickets;
    }

    @Override
    public void deal_with_report(){

    }

    public void buy_ticket(){

    }

    public void buy_ticket(int amount){

    }
}
