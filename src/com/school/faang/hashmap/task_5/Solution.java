package com.school.faang.hashmap.task_5;

public class Solution {
    public static void main(String[] args) {

        String text = "Nature is one of the most beautiful things in the world. I love spending time in nature. When I go outside, I feel more relaxed and peaceful. Nature gives us fresh air, green trees, clean water, and amazing views. Every part of nature is special — the sky, the mountains, the forests, the rivers, and the animals.\n" +
                "Many people forget how important nature is. We live busy lives and spend a lot of time indoors. But nature helps us feel better. A short walk in nature can improve your mood and reduce stress. That’s why I try to go into nature every weekend.\n" +
                "Nature also teaches us to be calm and patient. Watching birds, listening to the wind, or sitting near a lake reminds me to slow down and enjoy the moment. I think we should all take better care of nature. If we protect nature, nature will protect us.\n" +
                "Nature is not just outside — it’s part of who we are. Nature is life, balance, and beauty. I hope more people will learn to love and respect nature as much as I do.";

        TextConverter textConverter = new TextConverter();
        textConverter.convert(text);
    }
}
