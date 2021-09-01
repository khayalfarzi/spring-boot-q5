package az.company.springbootq5.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "education", schema = "q5")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id", nullable = false, unique = true)
    private Integer id;

    @OneToOne(mappedBy = "education")
    private UserEntity user;

    @Column(name = "education_name")
    private String name;

    @Column(name = "education_level")
    private int level;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime creationDateTime;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updateDateTime;
}
