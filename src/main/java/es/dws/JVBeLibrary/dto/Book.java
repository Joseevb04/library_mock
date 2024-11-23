package es.dws.JVBeLibrary.dto;

import java.time.Year;

import es.dws.JVBeLibrary.enumeration.BookGenreEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Book {

    @NotNull
    @Min(0)
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @Null
    private BookGenreEnum genre;

    @NotNull
    @Past
    private Year publicationYear;

}
