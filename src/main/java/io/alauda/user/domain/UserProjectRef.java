package io.alauda.user.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="user_project_ref")
@Entity
@Getter
@Setter
public class UserProjectRef implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="project_id")
    private Long projectId;

    @Column(name="user_id")
    private Long userId;

}
