package com.team5.fandom.controller.rto.response;

import com.team5.fandom.entity.Fandom;
import com.team5.fandom.entity.User;
import com.team5.fandom.entity.value.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostTitleResponse {
    private Integer id;
    private String title;
    private String content;
    private String name;
    private String tag;
}


