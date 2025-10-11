package co.selena.kotlincourse.lessons.lesson3

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by GoldColor