/**
 * Created by Administrator on 2017/4/25.
 */
$(function(){
    salesMyEcharts();
    monthOrderMyEcharts();
    accidentAnalysis();
});
//等级分类饼图
function accidentAnalysis() {
    var type = $("#type").val();
    var begin = $("#begin").val();
    var end = $("#end").val();

    //事故级别分类饼图
    $.ajax({
        url: "accident/analysisLevel",
        type: "post",
        data: {type: type, begin: begin, end: end},
        success: function (res) {

            var ss = JSON.parse(res);
            var nameArr = [];
            var anny1 = "";
            var sum = 0;
            for (var i = 0; i < ss.data.length; i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;

                if (i == ss.data.length - 1) {
                    anny1 += ss.data[i].name + "等";
                } else {
                    anny1 += ss.data[i].name + "、";
                }
            }

            $("#anny2").text(sum + "个");

            $("#t11 *:not(.first_td)").remove();
            $("#t12 *:not(.first_td)").remove();
            $("#t13 *:not(.first_td)").remove();

            var max = 0;
            var min = 0;
            for (var i = 0; i < ss.data.length; i++) {
                var c = ss.data[i].value / sum;
                var td1 = "<td>" + ss.data[i].name + "</td>";
                var td2 = "<td>" + ss.data[i].value + "</td>";
                var td3 = "<td>" + (c * 100).toFixed(2) + "%</td>";
                $("#t11").append(td1);
                $("#t12").append(td2);
                $("#t13").append(td3);

                if (i > 0) {
                    if (ss.data[i].value > ss.data[max].value) {
                        max = i;
                    }

                    if (ss.data[i].value < ss.data[min].value) {
                        min = i;
                    }
                }
            }

            $("#anny3").text(ss.data[max].name + "(" + ss.data[max].value + "个,占比" + (ss.data[max].value / sum * 100).toFixed(2) + "%)");

            var myChart = echarts.init($("#container")[0]);
            var option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: nameArr
                },

                series: [
                    {
                        name: '事故级别分析',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    });

    //原因分类饼图
    $.ajax({
        url:"accident/analysisReason",
        type:"post",
        data:{type:type,begin:begin,end:end},
        success:function (res){
            var ss = JSON.parse(res);
            var nameArr = [];

            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;
            }

            $("#t21 *:not(.first_td)").remove();
            $("#t22 *:not(.first_td)").remove();
            $("#t23 *:not(.first_td)").remove();

            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t21").append(td1);
                $("#t22").append(td2);
                $("#t23").append(td3);
            }

            var myChart = echarts.init($("#container3")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },
                calculable : true,
                series : [
                    {
                        name:'事故原因分析',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);

        }

    });

    //惩罚分类饼图
    $.ajax({
        url:"accident/analysisSolution",
        type:"post",
        data:{type:type,begin:begin,end:end},
        success:function (res){
            var ss = JSON.parse(res);
            var nameArr = [];

            var sum = 0;
            for(var i = 0;i<ss.data.length;i++) {
                nameArr.push(ss.data[i].name);
                sum += ss.data[i].value;
            }

            $("#t31 *:not(.first_td)").remove();
            $("#t32 *:not(.first_td)").remove();
            $("#t33 *:not(.first_td)").remove();


            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t31").append(td1);
                $("#t32").append(td2);
                $("#t33").append(td3);
            }

            var myChart = echarts.init($("#container1")[0]);
            var option = {
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:nameArr
                },

                series : [
                    {
                        name:'事故惩罚分析',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:ss.data
                    }
                ]
            };
            myChart.setOption(option);
        }
    });

    //各行业事故分析柱状图
    $.ajax({
        url: "accident/analysisType01",
        type: "post",
        data: {type:type, begin:begin, end:end},
        success: function (res) {
            var ss = JSON.parse(res);

            var nameArr = [];
            var valueArr = [];

            var sum = 0;
            for (var i = 0; i < ss.data.length; i++) {
                nameArr.push(ss.data[i].name);
                valueArr.push(ss.data[i].value);
                sum += ss.data[i].value;
            }

            $("#t41 *:not(.first_td)").remove();
            $("#t42 *:not(.first_td)").remove();
            $("#t43 *:not(.first_td)").remove();

            for(var i = 0;i<ss.data.length;i++) {
                var c =ss.data[i].value/sum;
                var td1 = "<td>"+ss.data[i].name+"</td>";
                var td2 = "<td>"+ss.data[i].value+"</td>";
                var td3 = "<td>"+(c*100).toFixed(2)+"%</td>";
                $("#t41").append(td1);
                $("#t42").append(td2);
                $("#t43").append(td3);
            }

            var myChart = echarts.init($("#container2")[0]);
            var option = {
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    data:[]
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data:nameArr,
                        rotate:40,interval:0
                    }
                ],

                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'单位数量（个）',
                        type:'bar',
                        barWidth:'30',
                        data:valueArr,
                        itemStyle: {
                            normal: {
                                color:"#269fec"
                            }
                        }

                    }
                ]
            };
            myChart.setOption(option);
        }
    });

}
function salesMyEcharts(){
    var salesMyChart = echarts.init($("#container5")[0]);
    var option = {

        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['火灾类','腐蚀类','坍塌类','爆炸类','其他']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月',"12月"]
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name:'腐蚀类',
                type:'line',
                stack: '总额（万元）',
                data:[120, 132, 101, 134, 90, 230, 210, 132, 101, 134, 90, 230, 210]
            },
            {
                name:'火灾类',
                type:'line',
                smooth:false,
                itemStyle:{
                    normal:{
                        lineStyle:{
                            width:2,
                            type:'solid'  //'dotted'虚线 'solid'实线
                        }
                    }
                },
                stack: '总额（万元）',
                data:[220, 182, 191, 234, 290, 330, 310, 132, 101, 134, 90, 230, 210]
            },
            {
                name:'坍塌类',
                type:'line',
                stack: '总额（万元）',
                data:[150, 232, 201, 154, 190, 330, 410, 132, 101, 134, 90, 230, 210]
            },
            {
                name:'爆炸类',
                type:'line',
                stack: '总额（万元）',
                data:[320, 332, 301, 334, 390, 330, 320, 132, 101, 134, 90, 230, 210]
            },
            {
                name:'其他',
                type:'line',
                stack: '总额（万元）',
                data:[820, 932, 901, 934, 1290, 1330, 1320, 132, 101, 134, 90, 230, 210]
            },

        ]
    };
    salesMyChart.setOption(option);
}
function monthOrderMyEcharts(){
    var monthOrderMyChart = echarts.init($("#container4")[0]);
    var option = {
        tooltip: {
            trigger: 'axis'
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['1','2','3','4','5','6','7','8','9','10','11','12']
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name:'事故数',
                type:'line',
                stack: '（个）',
                data:[120, 132, 101, 134, 90, 230, 210, 132, 101, 134, 90, 230, 210, 132, 101, 134, 90, 230, 210, 132, 101, 134, 90, 230, 132, 101, 134, 90, 230, 210, 132, 101, 134, 90, 230]
            }
        ]
    };
    monthOrderMyChart.setOption(option);
    monthOrderMyChart.on('click', function (param) {
        edit()
    });
}

function edit() {
    var Name = "单个物品分析";
    var Href = "from_analysis.html";
    //var data_id = $("#add").attr('data-id');
    window.parent.$.learuntab.myAddTab(Name, Href);
}

