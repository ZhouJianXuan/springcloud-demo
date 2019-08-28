package com.example.providerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{name}")
    public Result getStr(@PathVariable String name){
        Map<String, String> map = new HashMap<>();
        map.put("张良", "张良，字子房。在秦时明月之诸子百家中登场的新人物。秦时明月中的张良天资聪慧，未卜先知，与墨家和项氏一族共同抗秦。据他所说天明会欠他七个人情（片中为儒家弟子的三师公）。其计谋超群，棋艺出众，在墨家未到桑海时就猜出了要发生的事，还懂得运用小孔成像原理。胸怀大志的激进青年，样貌洒脱不羁，常被荀子称赞。虽身为儒家弟子，性格、见识上却反而与墨家慷慨济世的教义相投。因此也引起了一场儒家内部、儒家与墨家之间的轩然大波。");
        map.put("秦始皇", "秦始皇是中国第一个统一天下的皇帝。在秦时明月中，因爱慕丽姬的美貌虏其为妻，作为荆天明年幼时的养父，对天明爱屋及乌。后荆轲刺秦失败，丽姬自尽，秦始皇派人追杀天明。其实并不是反派角色(他究竟是对是错，各人看法不一)，但因其横扫六国使得许多人失去家园，及与主人公立场相反，所以在秦时明月中被放在一个相对反面的位置。秦始皇在秦时明月中佩剑为天问，在十大剑谱中排名第一，但是否会武功暂并未明确说明。");
        map.put("朱家", " 朱家，农家六堂之一神农堂的堂主，号称“三心二意”、“千人千面”，每次见人都是一副不同的面孔，消息灵通。与烈山堂堂主田猛互为争夺下一任农家侠魁的最强劲对手。与卫庄的“流沙”组织是旧相识。其原型为秦汉之际的游侠朱家。");
        map.put("刘邦", "他是秦时明月动画尚未登场的新角色，草根皇帝刘邦。人设图来自秦时明月手游，既然出了人物模型，相信在秦时明月动画中他也会登场。或许是因为大家对少羽的喜爱，虽然知道历史上有这么个刘邦存在，但似乎不是很受欢迎啊。");
        Person person = new Person();
        person.setName(name);
        String msg = "不详";
        person.setMsg(map.getOrDefault(name, msg));
        return new Result<Person>(person);
    }

    @RequestMapping(value = "/special/{number}")
    public Result getSpecialStr(@PathVariable String number){
        Person person = new Person();
        person.setName(number);
        person.setMsg("Number is "+number);
        return new Result<Person>(person);
    }
}
