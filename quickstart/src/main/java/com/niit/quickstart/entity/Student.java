package com.niit.quickstart.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

/**
 * 如果没有添加@Setter注解，则LombokTest中的student示例无法使用setAge()等方法。
 * 使用lombok之后，省去了许多没必要的get，set，toString，equals，hashCode代码，简化了代码编写，减少了代码量。
 * 另外@Data注解的作用相当于 @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode的合集。
 * 另外@Log 省去了在LombokTest中添加 getLogger的如下代码：
 * private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
//@Data
@Configuration
public class Student {
    private String name;
    private int age;
    private String male;
    private String studentNo;
}