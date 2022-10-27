package com.wot.workouttracking.entitiy;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="user_muscle_groups")
@EqualsAndHashCode(of = "id")

public class UserMuscleGroup {

    @Id
    @SequenceGenerator(name = "seq_user_muscle_groups",allocationSize = 1)
    @GeneratedValue(generator = "seq_user_muscle_groups",strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "active")
    private Boolean active;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="muscle_groups_id")
    private MuscleGroup muscleGroup;
}
