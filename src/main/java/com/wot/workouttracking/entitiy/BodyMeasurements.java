package com.wot.workouttracking.entitiy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="body_measurements")
public class BodyMeasurements {
    @Id
    @SequenceGenerator(name = "seq_body_measurements",allocationSize = 1)
    @GeneratedValue(generator = "seq_body_measurements",strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "waist")
    private double waist;

    @Column(name = "neck")
    private double neck;

    @Column(name = "hip")
    private double hip;

    @Column(name = "fat_rate")
    private double fat_rate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
