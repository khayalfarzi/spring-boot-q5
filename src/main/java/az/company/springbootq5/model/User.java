package az.company.springbootq5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "q5")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "user_name", length = 25, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender", length = 7)
    private Gender gender;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = Product.class)
    @JoinTable(name = "user_products", schema = "q5",
            joinColumns =
            @JoinColumn(name = "user_id",
                    referencedColumnName = "user_id",
                    nullable = false),
            inverseJoinColumns =
            @JoinColumn(name = "product_id",
                    referencedColumnName = "id",
                    nullable = false))
    private List<Product> products;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime creationDateTime;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updateDateTime;
}
