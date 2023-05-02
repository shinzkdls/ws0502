<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
    let chart04 = {
        init: function () {
            var defaultData = 'http://127.0.0.1/logs/custinfo.log';
            var urlInput = document.getElementById('fetchURL');
            var pollingCheckbox = document.getElementById('enablePolling');
            var pollingInput = document.getElementById('pollingTime');

            function createChart() {
                Highcharts.chart('container', {
                    chart: {
                        type: 'spline'
                    },
                    title: {
                        text: 'Live Data'
                    },
                    accessibility: {
                        announceNewData: {
                            enabled: true,
                            minAnnounceInterval: 15000,
                            announcementFormatter: function (allSeries, newSeries, newPoint) {
                                if (newPoint) {
                                    return 'New point added. Value: ' + newPoint.y;
                                }
                                return false;
                            }
                        }
                    },
                    data: {
                        csvURL: urlInput.value,
                        enablePolling: pollingCheckbox.checked === true,
                        dataRefreshRate: parseInt(pollingInput.value, 10)
                    }
                });

                if (pollingInput.value < 1 || !pollingInput.value) {
                    pollingInput.value = 1;
                }
            }

            urlInput.value = defaultData;
            pollingCheckbox.onchange = urlInput.onchange = pollingInput.onchange = createChart;
            createChart();
        }
    };
    $(function () {
        chart04.init();
    });
</script>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Live Chart</h1>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Live Chart</h6>
        </div>
        <div class="card-body">
            <div id="container"></div>
            <div class="ld-row">
                <label class="ld-label">
                    Enable Polling
                </label>
                <input type="checkbox" checked="checked" id="enablePolling"/>
            </div>
            <div class="ld-row">
                <label class="ld-label">
                    Polling Time (Seconds)
                </label>
                <input class="ld-time-input" type="number" value="2" id="pollingTime"/>
            </div>
            <div class="ld-row">
                <label class="ld-label">
                    CSV URL
                </label>
                <input class="ld-url-input" type="text" id="fetchURL"/>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->
