package org.example.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Compte {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  Long id;
  @Column
  double solde;
  @Column
  Date date;
  @Column
  TypeCompte type;
  @Column
  EtatCompte etat;
}

