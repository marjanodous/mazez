package com.example.maze.model;


import com.example.maze.R;

import java.util.ArrayList;

public class FoodsSearch {
    ArrayList<Item_recycler> arrayFoods;
    public ArrayList setArrayDefult() {
        arrayFoods = new ArrayList<>();

        arrayFoods.add(new Item_recycler(R.drawable.img5, "مرصع پلو",
                "مرغ کامل :  1 عدد\n" +
                        "پیاز :  2 عدد متوسط\n" +
                        "زعفران :   1/3 ق چ\n" +
                        "مغز گرد :  1/2 لیوان\n" +
                        "خلال پسته :  1/2 لیوان \n" +
                        "خلال بادام:   1/2 لیوان\n" +
                        " خلال پوست پرتقال یا نارنج :   1/3 لیوان\n" +
                        " کشمش :  1 لیوان \n" +
                        "زرشک :  1 لیوان\n" +
                        "زردچوبه :  1/2 ق چ\n" +
                        "نمک :  به میزان لازم\n" +
                        "شکر  در صورت نیاز:به میزان لازم",
                "ابتدا  برنج را بشویید و با کمی نمک و آب چند ساعت خیس کنید.\n" +
                        "سپس موادی نظیر (مرغ ،خلال پرتقال ، زرشک و کشمش ) را که برای تزیین  برنج استفاده میشوند آماده کنید.\n" +
                        "برای این کار هم باید زرشک و کشمش را از 2 ساعت قبل در آب سرد به صورت جداگانه خیس کنید تا اگر احیانا گل و یا سنگ ریزه ای داشت ته نشین شود.سپس مرغ را به چهار قسمت تقسیم کنید و به همراه مقداری نمک ،زردچوبه و 1 عدد پیاز و مقداری آب بپزید تا گوشت مرغ کاملا پخته شود .\n" +
                        "مرغ پخته شده را از استخوان جدا کنید و به قطعات کوچکتر برش دهید.\n" +
                        " همچنین اگر خلال پرتقال یا نارنج شیرین شده تهیه کردید که نیازی نیست برای شیرین شدنش کاری بکنید ولی در غیر این صورت باید خلال ها را چند بار در آب خیس کنید و آب آن را خالی کنید و در مرحله بعد در آب جوش یکی دو قول جوش بزنید و  آب آن را خالی کنید.این کار را 3 دفعه انجام دهید تا تلخی خلال های پرتقال کاملا از بین برود.بعد از شیرین شدن خلال ها آن ها را در مقداری روغن داغ بر روی حرارت ملایم به اندازه یکی دو چرخ تفت دهید .\n" +
                        "و در پایان به اندازه یک قاشق سوپ خوری شکر روی آن بریزید و خوب مخلوط کنید و وقتی خلال ها یکدست شد آنرا از روی حرارت بردارید تا در اثر حرارت شکر ذوب شود.\n" +
                        "زرشک و کشمش را هم بعد از اینکه خوب خیس خوردند از آب بیرون میاوریم. و نصف پیاز را با روغن تفت میدهیم و وقتی رنگ پیاز ها طلایی شد زرشک ها را داخل آن میریزیم و یک تفت کوچک میدهیم تا زرشک ها نسوزند.اگر هم زرشک ها ترش مزه بودند میتوانید یک دو قاشق سوپخوری شکر به آن اضافه کنید و مزه آن را شیرین کنید.\n" +
                        " همچنین نصف دیگر پیاز ها را هم با مقداری روغن تفت میدهیم و بعد از اینکه رنگ پیاز طلایی شد کشمش رادر آن کمی تفت میدهیم و آماده میکنیم.\n" +
                        " بعد از آماده سازی مواد تزیین پلو ، برنج را که از قبل خیس خورده شده آبکش میکنیم و دم میدهیم .\n" +
                        " مرغ پخته و آماده شده را با زرشک و کشمش مخلوط کنید و در هنگام سرو برنج با نصف چلو مخلوط کنید و مقداری از برنج را هم با زعفران دم کرده مخلوط کنید و به همراه خلال ها روی برنج بریزید . در آخر هم میتوانید مقداری روغن داغ کنید و روی برنج بکشید."));
        arrayFoods.add(new Item_recycler(R.drawable.kabab, "برای کباب کوبیده زعفرانی",
                "گوشت چرخ کرده :یک کیلو\n" +
                        "پیاز متوسط :4 عدد\n" +
                        "نمک و فلفل:به مقدار لازم\n" +
                        "زعفران :به مقدار لازم",
                "در تهیه این کباب، از گوشت چرخ کرده ای که 30 در صد چربی داشته باشد استفاده کنید. گوشت را در یک ظرف مسی بریزید و پیاز را داخل آن رنده کنید.\n" +
                        "نمک، فلفل و زعفران را اضافه کنید و تا جایی که می توانید، گوشت را ورز دهید تا حدی که گوشت، حالت چسبندگی پیدا کند. می توان برای ایجاد چسبدگی بیشتر، از زرده یک تخم مرغ استفاده کرد.\n" +
                        "برای سیخ کردن کباب هم باید توجه داشته باشید که از سیخ های پهن برای پخت این کباب باید استفاده کنید.\n" +
                        "قبل از اینکه شروع به کار کنید، مقدماتی لازم است. ابتدا در کاسه کوچکی مقداری آب سرد بریزید و کنار دست تان قرار دهید. حالا پیش از برداشتن مایه کباب دست تان را در آب خیس کرده، یک مشت از مایه را بردارید و به شکل دوک درآورید؛ سپس همان طور که مواد در دست راست تان قرار دارد، سیخ را روی مایه دوکی بگذارید و شروع به پوشاندن سطح سیخ با مایه کباب کنید.\n" +
                        "در پایان دوباره دست تان را در آب سرد فرو کنید و روی سیخ فشار دهید تا اثر انگشتان شما بر گوشت باقی بماند. حالا ابتدا و انتهای کباب را به سیخ بچسبانید و کناری بگذارید. همین کار را درباره همه مواد و سیخ ها انجام دهید."));
        arrayFoods.add(new Item_recycler(R.drawable.qeime, "خورش قیمه",
                "گوشت :200 گرم\n" +
                        "لپه :70 گرم\n" +
                        "رب :1-2 قاشق \n" +
                        "پیاز عسلی :3-4 قاشق\n" +
                        "چوب دارچین :1عدد\n" +
                        "هل سبز :5 -6 عدد\n" +
                        "گلاب :1 قاشق\n" +
                        "زرشک :برای تزیین  2 قاشق  \n" +
                        "روغن :2قاشق",
                "ابتدا باید درون قابلمه مناسب پیاز عسلی از قبل سرخ شده را به همراه گوشت و کمی روغن به مدت 10 الی 12 دقیقه با حرارت پایین تفت میدهیم .نکته مهم و قابل توجه در مورد این خورش طرد بودن گوشت خورش است که برای این کار بهتر است گوشت مان را از شب قبل با کمی فلفل و روغن مخلوط کرده و استراحت دهیم.\n" +
                        "بعد از تفت گوشت و پیاز با حرارت بالا لپه و رب را به مواد ما اضافه میکنیم و حرارت را کمی بیشتر میکنیم و شروع میکنیم به تفت دادن تا مواد کاملاً در هم مخلوط شوند و رنگ رب در روغن جذب شود و خورش ما خوشرنگ تر شود و به اندازه 2 لیوان آب ولرم به غذا اضافه میکنیم.\n" +
                        "تا به جوش بیاید و بعد حرارت را کم میکنیم تا خورش ما آرام آرام بپزد . بخاطر اینکه به گوشتمان فلفل اضافه کردیم گوشت خورش سریعتر می پزد. بقیه مواد مثل گلاب و لیمو عمانی ،نمک و ادویه جات را در 10 دقیقه آخر به خورشتان اضافه کنید و حتما هل و دارچین را از قبل بجوشانید و با کمی آب به خورشتتان اضافه کنید.\n" +
                        "سپس می توانید سیب زمینی ها را به صورت خلالی و یا شکل دلخواه در آورده و برای تزیین به خورش قیمه دلچسپتان اضافه کنید.\n"));
        arrayFoods.add(new Item_recycler(R.drawable.img6, "قورمه سبزی ",
                "گوشت سر دست با مغز ران بدون استخوان :نیم کیلو گرم\n" +
                        "پیاز سرخ کرده :3 قاشق سوپخوری\n" +
                        "روغن (حیوانی یا نباتی) :250 گرم\n" +
                        "لیمو عمانی (یا گرد لیمو) :5 تا 6 عدد\n" +
                        "لوبیا قرمز یا لوبیای چیتی (بسته به سلیقه) :نیم لیوان\n" +
                        "سبزی خورش (تره ، جعفری ، گشنیز ، شنبلیله و نعناع ) :1 کیلو گرم\n" +
                        "نمک :به مقدار لازم\n" +
                        "زردچوبه :به مقدار لازم\n" +
                        "فلفل : به مقدار لازم" ,
                "ابتدا پس از تمیز کردن گوشت و بعد از خرد کردن پیاز این دو را با هم در یک جا تفت میدهیم . در مرحله بعدی زردچوبه را به این گوشت و پیاز افزوده و همراه با آب و لوبیا قرمز مخلوط کرده و آن را حرارت میدهیم. این حرارت را تا جایی ادامه می دهیم که گوشت نیم پز شود.\n" +
                        "حال سبزیجات خود که شامل تره ، جعفری ، گشنیز ، شنبلیله و چند پر نعناع میباشد را تمیز کرده و پس از شستشو دادن آنها را خرد میکنیم\n" +
                        "وقت آن رسیده است که این سبزی ها را نیز به غذای خود اضافه کنیم . در مرحله بعد ادویه های خود را به آن اضافه کنیم . به صورت پیشفرض فلفل و نمک برای قورمه سبزی کافیست . اما شما بر حسب تجربه می توانید از ادویه های دیگر استفاده کنید.\n" +
                        "بعد از اینکه غذای ما چند بار جوش خورد ، وقت آن می رسد که لیمو عمانی را به غذا اضافه کنیم . دقت داشته باشید که بر روی لیمو عمانی چند سوراخ کوچک ایجاد کنید تا غذا پخش شود . به یاد داشته باشید که اگر لیمو عمانی شما تلخ باشد تمام قرمه سبزی شما تلخ خواهد شد.\n" +
                        "پس اگر از کیفیت لیمو عمانی خود اطمینان ندارید سعی کنید از گرد لیمو استفاده کنید . شما می توانید یک سوم پیمانه آب غوره هم به خورشت اضافه کنید البته این دلبخواهی و بستگی به مزاج شما دارد . حال منتظر می مانیم تا غذا پخته شود . به یاد داشته باشید زمانی متوجه می شویم که غذا پخته است که یک سطح روغنی روی غذا به وجود بیاید.\n"));
        arrayFoods.add(new Item_recycler(R.drawable.img2, "مرغ سلطانی",
                "مرغ :1400 گرم\n" +
                        "سیب زمینی سرخ شده :700 گرم\n" +
                        "لیمو ترش :2 عدد\n" +
                        "سیر، زنجفیل تازه، فلفل قرمز چیلی :یک قاشق سوپ خوری\n" +
                        "گوجه فرنگی فیله شده :یک عدد\n" +
                        "پودر گشنیز، زردچوبه، گرام ماسالا و زیره سبز :یک قاشق سوپ خوری\n" +
                        "ماست :2 قاشق چایخوری\n" +
                        "نمک :2 قاشق چای خوری",
                "برای درست کردن ترکیبات چاشنی:سیر، فلفل قرمز و زنجفیل را رنده می کنیم تا ترکیب آنها 1 قاشق سوپ خوری پر شود.\n" +
                        "گوجه فرنگی را داخل میکسر پوره کنید 1 قاشق سوپ خوری از آن برای مزه دار کردن مرغ کافی است.\n" +
                        "از ترکیب پودر گشنیز، زردچوبه، گرام ماسالا و زیره سبز هم 1 قاشق سوپ خوری پُر نیاز است.\n" +
                        "در ابتدا بافت زیر استخوان ران مرغ را چند بار برش می زنیم.\n" +
                        "یک تابه سرخ کن بزرگ (کمی بزرگ تر از اندازه مرغ) آماده کرده، مرغ و ترکیب چاشنی را در آن می ریزیم و به خوبی مخلوط می کنیم.\n" +
                        "با استفاده از دستکش، مرغ را به خوبی ماساژ می دهیم تا چاشنی کاملا داخل و روی مرغ را بپوشاند، در صورت امکان مرغ را به مدت یک شب در یخچال نگه می داریم.\n" +
                        "فر را از قبل با حرارت 200 درجه سانتی گراد گرم می کنیم.\n" +
                        "لیمو ترش را با چاقو چند برش کوچک زده و داخل شکم مرغ قرار می دهیم. پس از آن مرغ را بر روی سینی فر قرار می دهیم.\n" +
                        "  2 پیمانه آب یا در صورت تمایل آب مرغ را بر روی مرغ ریخته و سینی را در طبقه پایین فر جا می دهیم. حدود 1 ساعت و 20 دقیقه مواد را می پزیم.\n" +
                        "پس از پخته شدن مرغ، آن را بر روی یک سطح صاف و تمیز قرار داده و با دقت تکه های سیاه و سوخته مرغ را جدا می کنیم تا سطح شفاف بافت گوشت مرغ مشخص شود.\n" +
                        "سپس مرغ را همراه با سیب زمینی و آب مرغ (اگر دوست داشتید) روی میز می چینیم.\n" +
                        "غذا را با برگ های گشنیز تزیین کرده و در کنار ادویه انتخابی خود سرو می کنیم."));
        arrayFoods.add(new Item_recycler(R.drawable.nesar1, "قیمه نثار ",
                "برنج خیس کرده3 پیمانه\n" +
                        "گوشت قیمه خرد شده350 گرم\n" +
                        "پیاز خرد کرده ریز2 عدد\n" +
                        "لپه خیس کرده1/2 پیمانه\n" +
                        "روغن1/2 پیمانه\n" +
                        "رب گوجه فرنگی2 قاشق س\n" +
                        "ادویه خورشتی1 قاشق چ\n" +
                        "ادویه پلویی1 قاشق چ\n" +
                        "گلاب1 قاشق س\n" +
                        "زعفران دم کرده1 قاشق س\n" +
                        "زرشک خشک شده1/2 پیمانه\n" +
                        "گرد لیمو عمانی مقداری\n" +
                        "نمک مقداری\n" +
                        "خلال پسته و بادام ",
                "طرز تهیه سنتی"));
        arrayFoods.add(new Item_recycler(R.drawable.hamberger1, "همبرگر",
                " گوشت چرخ کرده :100 گرم\n" +
                        "پنیر پیتزا :به مقدار دلخواه\n" +
                        "زرده تخم مرغ :دو عدد\n" +
                        "پیاز :یک عدد\n" +
                        "نمک :به میزان لازم\n" +
                        "فلفل :به میزان لازم\n" +
                        "پودر گردو :در صورت تمایل\n" +
                        "روغن :به میزان لازمهمبرگر\n",
                "پیاز را سرخ میکنیم و بعد به گوشت اضافه کرده و به خوبی مخلوط میکنیم .\n" +
                        "    زرده را به گوشت اضافه کرده به خوبی ماساژ میدهیم و بعد نیز نمک و فلفل را به آن اضافه میکنیم .\n" +
                        "    روی تخته پودر نان میپاشیم ، گلوله هایی به اندازه نارنگی از مواد را برداشته ، بروی تخته گرد کرده و نازک میکنیم ، سپس در تابه چدنی سرخ میکنیم .\n" +
                        "    بعد از این که همبرگر ها آماده شدند ، بر روی آنها مقداری پنیر پیتزا ریخته و آن را برای مدت زمان چند دقیقه درون فر میگذاریم تا پنیر باز شود .\n"));
        arrayFoods.add(new Item_recycler(R.drawable.meigusokhari1,
                "میگو سوخاری",
                "میگو: 1 کیلو\n" +
                        "آبلیمو: یک قاشق سوپخوری\n" +
                        "ماست:دو قاشق سوپخوری\n" +
                        "پیاز: یک عدد\n" +
                        "آرد : 2/3 لیوان\n" +
                        "تخم مرغ : یک عدد\n" +
                        "زعفران : نصف قاشق چایخوری\n" +
                        "نمک : به مقدار لازم\n" +
                        "بیکینگ پودر:یک قاشق چایخوری\n" +
                        "فلفل : به مقدار لازم\n",
                "     اول میگو را تمیز میکنیم پوست آن را کنده ، میشوییم و سپس آن را در آب پیاز که قبلا آن را رنده کرده و آب آن را جدا کرده ایم می ریزیم.\n" +
                        "            بعلاوه مقداری آبلیمو و فلفل سیاه. بعد آن را مخلوط می کنیم .\n" +
                        "            در ظرف را بسته و یک ساعت داخل یخچال قرار می دهیم . \n" +
                        "            سس مخصوص میگو پفکی را با مخلوط کردن آرد ، تخم مرغ، زعفران ، ماست ،بیکینگ پودر و نمک تهیه می کنیم. \n" +
                        "            سس ما نباید زیاد سفت یا شل باشد. اگر سفت شد مقداری ماست و اگر شل شد مقداری آرد به آن بیافزایید.\n" +
                        "            سپس میگوها را از آب پیاز خارج کرده و داخل مایع ریخته ، مخلوط کرده و در ظرف را گذاشته و نیم ساعت درون یخچال قرار می دهیم .\n" +
                        "              یک ظرف کوچک نچسب را روی اجاق گاز قرارداده و داخل آن روغن ریخته و می گذاریم داغ شود.\n" +
                        "            ظرف باید کوچک باشد تا روغن روی میگو ها را بگیرد، پس از اینکه روغن کاملاً داغ شد حرارت را پائین کشیده و میگوها را یکی یکی داخل روغن می ریزیم وقتی یک طرف آن طلایی شد ، میگو را بر می گردانیم تا طرف دیگر آن نیز طلایی شود ، دقت کنید حرارت مقداری باشد که روغن نسوزد .\n"));
        arrayFoods.add(new Item_recycler(R.drawable.pitzza1,
                "پیتزا پپرونی",
                "گوشت چرخ کرده:200گرم\n" +
                        "فلفل دلمه ای:1عدد\n" +
                        "رب گوجه فرنگی :3قاشق غذاخوری\n" +
                        "قارچ :200گرم\n" +
                        "پیاز :1عدد\n" +
                        "کالباس : 200گرم\n" +
                        "پنیرپیتزا :به مقدازلازم\n" +
                        "نمک فلفل پودر اویشن:به مقذار دلخواه\n",
                "  پیاز راخرد کنید ودرون ماهیتابه بامقداری روغن تفت بدهید تانرم شود سپس گوشت نمک فلفل وپودر اویشن رابه ان اضافه کرده وباحرارت ملایم تفت میدهیم!پس از اینکه رنگ گوشت تغییر کرد 1قاشق رب گوجه فرنگی اضافه نموده ودوباره تفت میدهیم وپس از 5دقیقه از روی حرارت اجاق برمیداریم!\n" +
                        "        کالباس رامکعبی خرد کنید پیاز راحلقه ای خرد کنید فلفل دلمه ای را ریز کرده مقداری زیتون هم ریز کنید!\n" +
                        "        خمیر پیتزا را نازک پهن کنید 2قاشق رب گوجه فرنگی راتفت داده تا بوی خامی ندهد سپس با قلمو روی خمیر پیتزا پخش کنید ومقداری پنیر بریزید وتمامی موادی راکه خرد کرده بودید(کالباس پیاز و...)به همراه مایه گوشتی روی خمیر بچینید ودر انتها با لایه کاملی از پنیر پیتزا پوشش دهیدوروی ان زیتون بریزیدو اجازه دهید پیتزای شما 20دقیقه بماند تا خمیر استراحت کند ودر زمان پخت خوب ترد وبرشته شود.\n" +
                        "        پیتزا را به مدت 15الی 20 دقیقه در طبقه وسط فر میگذاریم البته فر را باید از قبل در دمای 180 درجه گرم کنید!\n" +
                        "        در صورتیکه میخواهید روی پیتزای شما طلایی شود گریل بالا را روشن کنید ومواظب باشد پنیر پیتزایتان نسوزد! پیتزایتان را باسس دلخواه سرو نمایید\n"));
        arrayFoods.add(new Item_recycler(R.drawable.danesgzorat,
                "ذرت مکزیکی",
                "ذرت شیرین 500 گرم\n" +
                        "نمک و فلفل به میزان لازم\n" +
                        "قارچ 250 گرم\n" +
                        "پنیر پیتزا 100 گرم\n" +
                        "آویشن 1 ق چ\n" +
                        "کره 30 گرم\n" +
                        "روغن مایع 3 تا 4 ق س\n" +
                        "سس مایونز 1 و نیم پیمانه\n" +
                        "نمک 1 ق چ\n" +
                        "فلفل سیاه نصف ق چ\n" +
                        "فلفل قرمز 1/2 ق چ\n" +
                        "پودر گلپر 1 ق چ\n" +
                        "ادویه کاری 1/2 ق چ\n",
                "رای درست کردن ذرت مکزیکی میتوانید از ذرت های شیرین تازه و یا از کنسرو ذرت استفاده کنید.قارچ ها را هم خرد میکنیم و در یک قابلمه ای که 2/3 آن را پر از آب کردیم و مقداری آبلیمو ریختیم و روی حرارت به جوش آمد میریزیم و فقط در حدی که یک جوش بخورد داخل قابلمه نگه میداریم و سریع داخل آبکش میریزیم و زیر آب سرد نگه میداریم .\n" +
                        "بعد از این مراحل، کره و روغن مایع را داخل قابلمه ای میریزیم تا داغ شود و بعد ذرت را داخل کره و روغن کمی تفت میدهیم در حدی که طعم دار شوند. بعد قارچ ها ی بلانچ شده را داخل آن میریزیم و در حد هم زدن و مخلوط کردن تفت میدهیم .\n" +
                        "نمک ، فلفل ، و بقیه ادویه ها را هم اضافه میکنیم و هم میزنیم تا مواد روی حرارت گرم شوند .\n"));
        arrayFoods.add(new Item_recycler(R.drawable.daneshmakaroni,
                "ماکارونی",
                "ماکارونی:1 بسته\n" +
                        "فلفل دلمه:1عدد\n" +
                        "نخود فرنگی:100 گرم\n" +
                        "پیازمتوسط:2عدد\n" +
                        "رب:2 قاشق غذا خوری\n" +
                        "قارچ:200گرم\n" +
                        "گوشت چرخ کرده:300 گرم\n" +
                        "نمک و ادویه کاری:به مقدار لازم\n",
                "تابه ای را روی حرارت قرار دهید و مقداری روغن داخلش بریزید تا داغ شود. بعد پیاز را داخل روغن تفت دهید تا طلایی شود.  سپس گوشت را به پیاز سرخ شده اضافه کنید و تفت دهید  تا گوشت کمی سرخ شود و رنگش تغییر کند.\n" +
                        "بعد از تفت گوشت فلفل دلمه و قارچ خرد شده را هم به آن اضافه کنید و تفت دهید تا نرم شوند. در آخر رب گوجه را به مواد تفت داده شده اضافه کنید و کمی تفت دهید تا رنگ رب باز شود.\n" +
                        "و به همراه یک استکان آب جوش بگذارید تا گوشت بپزد و آب آن  کاملا جذب شود. در مرحله بعد ماکارونی را طبق دستور بپزید و آبکش کنید .\n" +
                        " ته قابلمه مورد نظر تان را چرب کنید و کف آن ته دیگ سیب زمینی بچینید و مقداری از ماکارونی را روی آن بریزید و روی ماکارونی مقداری آز مواد گوشت تفت داده شده بریزید و این لایه را آنقدر تکرار کنید تا تمام شوند.\n" +
                        "البته میتوانید ماکارونی و مایه گوشت را قبل ریختن در قابلمه با هم مخلوط کنید و یکجا در قابلمه بریزید و دم دهید.\n"));
   return arrayFoods;

    }
}
