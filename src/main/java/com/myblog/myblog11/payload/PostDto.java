package com.myblog.myblog11.payload;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private Long id;

    private String title;
    private String description;
    private String content;
}
