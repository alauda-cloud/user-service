package io.alauda.user.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "authorities")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Authority implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "username",referencedColumnName="username")
    private User user;
}
