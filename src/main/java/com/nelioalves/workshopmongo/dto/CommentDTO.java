package com.nelioalves.workshopmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;
}
