var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "193",
        "ok": "193",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1806",
        "ok": "1806",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "360",
        "ok": "360",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "164",
        "ok": "164",
        "ko": "-"
    },
    "percentiles1": {
        "total": "301",
        "ok": "301",
        "ko": "-"
    },
    "percentiles2": {
        "total": "341",
        "ok": "341",
        "ko": "-"
    },
    "percentiles3": {
        "total": "801",
        "ok": "801",
        "ko": "-"
    },
    "percentiles4": {
        "total": "931",
        "ok": "931",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 947,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 48,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 5,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "100",
        "ok": "100",
        "ko": "-"
    }
},
contents: {
"req_get-geocoding-aff2a": {
        type: "REQUEST",
        name: "Get Geocoding",
path: "Get Geocoding",
pathFormatted: "req_get-geocoding-aff2a",
stats: {
    "name": "Get Geocoding",
    "numberOfRequests": {
        "total": "500",
        "ok": "500",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "261",
        "ok": "261",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1806",
        "ok": "1806",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "368",
        "ok": "368",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "170",
        "ok": "170",
        "ko": "-"
    },
    "percentiles1": {
        "total": "306",
        "ok": "306",
        "ko": "-"
    },
    "percentiles2": {
        "total": "345",
        "ok": "345",
        "ko": "-"
    },
    "percentiles3": {
        "total": "810",
        "ok": "810",
        "ko": "-"
    },
    "percentiles4": {
        "total": "997",
        "ok": "997",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 473,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 24,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 3,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50",
        "ok": "50",
        "ko": "-"
    }
}
    },"req_get-postcode-484f2": {
        type: "REQUEST",
        name: "Get Postcode",
path: "Get Postcode",
pathFormatted: "req_get-postcode-484f2",
stats: {
    "name": "Get Postcode",
    "numberOfRequests": {
        "total": "500",
        "ok": "500",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "193",
        "ok": "193",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1276",
        "ok": "1276",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "353",
        "ok": "353",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "157",
        "ok": "157",
        "ko": "-"
    },
    "percentiles1": {
        "total": "296",
        "ok": "296",
        "ko": "-"
    },
    "percentiles2": {
        "total": "336",
        "ok": "336",
        "ko": "-"
    },
    "percentiles3": {
        "total": "800",
        "ok": "800",
        "ko": "-"
    },
    "percentiles4": {
        "total": "907",
        "ok": "907",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 474,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 24,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50",
        "ok": "50",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
