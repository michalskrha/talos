package sk.talos.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import sk.talos.model.common.BaseEntity;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@Entity
@Table(name = "post")
public class Post extends BaseEntity {

    private String title;

    private String body;

    @NotNull
    @Column(name = "user_id")
    private Long userId;

}
