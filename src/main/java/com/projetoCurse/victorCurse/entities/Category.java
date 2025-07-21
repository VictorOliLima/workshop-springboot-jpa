package com.projetoCurse.victorCurse.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;

        private Set<Product> products = new HashSet<>();
        public Category() {
        }

        public Category(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Category category = (Category) o;
            return Objects.equals(id, category.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
}
